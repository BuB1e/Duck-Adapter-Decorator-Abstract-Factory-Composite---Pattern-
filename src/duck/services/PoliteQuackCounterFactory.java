package duck.services;

import duck.models.DuckCall;
import duck.models.MallardDuck;
import duck.models.RedheadDuck;
import duck.models.RubberDuck;

public class PoliteQuackCounterFactory extends AbstractQuackFactory{
    @Override
    public Quackable createDuckCall() {
        return new PoliteQuackCounter(new PoliteQuack(new QuackCounter(new DuckCall())));
    }

    @Override
    public Quackable createMallardDuck() {
        return new PoliteQuackCounter(new PoliteQuack(new QuackCounter(new MallardDuck())));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new PoliteQuackCounter(new PoliteQuack(new QuackCounter(new RedheadDuck())));
    }

    @Override
    public Quackable createRubberDuck() {
        return new PoliteQuackCounter(new PoliteQuack(new QuackCounter(new RubberDuck())));
    }
}
