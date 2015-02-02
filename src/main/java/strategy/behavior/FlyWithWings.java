package strategy.behavior;


/**
 * Created by wzyoung on 2014/11/19.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm flying with wings!");
    }
}
