//6510451018 Harit Sombatsiri
package duck.services;

public class PoliteQuackCounter implements Quackable {
    Quackable quackable;
    static int numOfQuack = 0;

    public PoliteQuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numOfQuack++;
    }

    public static int getNumOfQuack() {
        return numOfQuack;
    }
}
