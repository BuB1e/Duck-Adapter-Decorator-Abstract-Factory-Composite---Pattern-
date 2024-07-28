//6510451018 Harit Sombatsiri
package duck.services;

import duck.services.Quackable;

public class QuackCounter implements Quackable {
    Quackable quackable;
    static int numOfQuack = 0;

    public QuackCounter(Quackable quackable) {
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
