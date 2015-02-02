package concurrency.StartOrRun;

/**
 * Created by wzyoung on 2014/12/17.
 */
public class ThreadTest implements Runnable {
    @Override
    public void run() {
        System.out.println("ThreadTest run: " + Thread.currentThread().getName());
    }
}
