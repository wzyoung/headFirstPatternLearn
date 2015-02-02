package strategy.model;

/**
 * Created by wzyoung on 2014/11/19.
 */
public class DoorClient {

    public static void main(String[] args) {
        Door alarmDoor = new AlarmDoor();

        alarmDoor.performAlarm();

        alarmDoor.close();

        alarmDoor.open();
    }
}
