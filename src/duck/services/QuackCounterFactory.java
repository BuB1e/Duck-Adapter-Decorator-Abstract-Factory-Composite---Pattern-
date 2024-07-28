package duck.services;

import duck.models.DuckCall;
import duck.models.MallardDuck;
import duck.models.RedheadDuck;
import duck.models.RubberDuck;

public class QuackCounterFactory extends AbstractQuackFactory{
    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
