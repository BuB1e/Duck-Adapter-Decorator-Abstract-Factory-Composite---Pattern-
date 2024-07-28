//6510451018 Harit Sombatsiri
package duck.models;

import duck.services.Quackable;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        System.out.println("");
        quackers.getFirst().quack();
        quackers.getFirst().quack();
        for (Quackable q : quackers) {
            q.quack();
            System.out.println("!");
        }
    }
}
