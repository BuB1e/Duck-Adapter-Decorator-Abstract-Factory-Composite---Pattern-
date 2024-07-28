//6510451018 Harit Sombatsiri
package duck.controllers;

import duck.models.*;
import duck.services.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate() {
        QuackCounterFactory quackCounterFactory = new QuackCounterFactory();
        PoliteQuackCounterFactory politeQuackCounterFactory = new PoliteQuackCounterFactory();

        Quackable mallardDuck = politeQuackCounterFactory.createMallardDuck();
        Quackable redheadDuck = quackCounterFactory.createRedheadDuck();
        Quackable rubberDuck = quackCounterFactory.createRubberDuck();
        Quackable duckCall = politeQuackCounterFactory.createDuckCall();

        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        Flock flock1 = new Flock();
        flock1.add(mallardDuck);
        flock1.add(redheadDuck);

        Flock flock2 = new Flock();
        flock2.add(duckCall);
        flock2.add(rubberDuck);
        flock2.add(goose);

        System.out.println("\nDuck Simulator");
        simulate(flock1);
        simulate(flock2);;
        System.out.println("The ducks quacked " + QuackCounter.getNumOfQuack() + " times");
        System.out.println("The ducks quacked politely " + PoliteQuackCounter.getNumOfQuack() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
