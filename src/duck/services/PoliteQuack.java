package duck.services;

public class PoliteQuack implements Quackable {
    Quackable quackable;

    public PoliteQuack(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        System.out.print("Jaa ");
    }
}
