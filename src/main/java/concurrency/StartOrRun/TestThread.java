package concurrency.StartOrRun;

/**
 * Created by wzyoung on 2014/12/18.
 */
public class TestThread extends Thread {

    public TestThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("TestThread   " + Thread.currentThread().getName());
    }
}
