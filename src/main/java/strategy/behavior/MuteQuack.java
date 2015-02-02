package strategy.behavior;

/**
 * Created by wzyoung on 2014/11/19.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("mute123");
    }
}
