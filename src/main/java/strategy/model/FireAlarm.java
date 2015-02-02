package strategy.model;

/**
 * Created by wzyoung on 2014/11/19.
 */
public class FireAlarm implements Alarm {
    @Override
    public void alarm() {
        System.out.println("fire alarm");
    }
}
