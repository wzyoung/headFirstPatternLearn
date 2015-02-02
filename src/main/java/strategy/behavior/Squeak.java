package strategy.behavior;

/**
 * Created by wzyoung on 2014/11/19.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
