package strategy.behavior;

/**
 * Created by wzyoung on 2014/11/19.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
