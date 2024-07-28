//6510451018 Harit Sombatsiri
package duck.services;

import duck.models.Pigeon;

public class PigeonAdapter implements Quackable {
    Pigeon pigeon;
    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }
    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
