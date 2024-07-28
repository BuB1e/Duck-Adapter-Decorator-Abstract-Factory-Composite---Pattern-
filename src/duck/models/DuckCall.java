//6510451018 Harit Sombatsiri
package duck.models;

import duck.services.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.print("kwak ");
    }
}
