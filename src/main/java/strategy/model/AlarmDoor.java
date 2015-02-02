package strategy.model;

/**
 * Created by wzyoung on 2014/11/19.
 */
public class AlarmDoor extends Door {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    public AlarmDoor() {
        alarm = new FireAlarm();
    }
}
