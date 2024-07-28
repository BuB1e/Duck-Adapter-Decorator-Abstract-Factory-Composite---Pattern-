//6510451018 Harit Sombatsiri
package duck.services;

import duck.models.Goose;

public class GooseAdapter implements Quackable {
    Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.honk();
    }
}
