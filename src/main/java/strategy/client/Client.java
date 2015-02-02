package strategy.client;

import strategy.behavior.FlyNoWay;
import strategy.behavior.Squeak;
import strategy.model.Duck;
import strategy.model.MallardDuck;

/**
 * Created by wzyoung on 2014/11/19.
 */
public class Client {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        mallardDuck.setFlyBehavior(new FlyNoWay());

        mallardDuck.setQuackBehavior(new Squeak());

        mallardDuck.performFly();

        mallardDuck.performQuack();

        mallardDuck.display();

        mallardDuck.setFlyBehavior(new FlyNoWay());

        mallardDuck.performFly();

    }


}
