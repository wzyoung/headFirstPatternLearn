package strategy.model;

/**
 * Created by wzyoung on 2014/11/19.
 */
public abstract class Door {

    Alarm alarm;

    public  void performAlarm() {
        alarm.alarm();
    }

    public abstract void open();

    public abstract void close();
}
