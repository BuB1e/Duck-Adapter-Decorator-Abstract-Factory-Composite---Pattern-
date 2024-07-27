package duck;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());

        Quackable duckCall = new DuckCall();
        Quackable goose = new GooseAdapter(new Goose());

        Flock flock1 = new Flock();
        flock1.add(mallardDuck);
        flock1.add(redheadDuck);

        Flock flock2 = new Flock();
        flock2.add(duckCall);
        flock2.add(rubberDuck);
        flock2.add(goose);

        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
