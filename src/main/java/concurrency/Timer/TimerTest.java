package concurrency.Timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer already cancelled Exception Test
 * Created by wzyoung on 2015/6/17.
 */
public class TimerTest {
    private Timer timer = new Timer();

    private void lanuch() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task start");
                throw new RuntimeException();
            }
        };
        timer.schedule(task, 0, 1000);
    }

    private void addNewTask() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("exception");
            }
        }, 100);
    }

    public static void main(String[] args) throws Exception {
        TimerTest test = new TimerTest();
        test.lanuch();
        Thread.sleep(1000);
        test.addNewTask();
    }
}
