package strategy.model;


import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

/**
 * Created by wzyoung on 2014/11/16.
 */
public abstract class Duck {


    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }


    public abstract void display();

    public void swim() {
        System.out.println("Every duck can swim");
    }

}
