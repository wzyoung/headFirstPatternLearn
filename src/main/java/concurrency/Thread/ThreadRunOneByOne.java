package concurrency.Thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 编写两个线程,一个是1-9,一个是a-i 运行结果为,1a2b3c4d5e6f7g8h9i
 * Created by wzyoung on 2015/7/11.
 */
public class ThreadRunOneByOne {

    private static boolean flag = false;

    private static Object lock = new Object();

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new ThreadStr());
        executorService.execute(new ThreadInt());
        executorService.shutdown();

    }


    public static class ThreadInt implements Runnable {

        @Override
        public void run() {

            for (int i = 1; i < 10; i++) {
                synchronized (lock) {
                    if (flag) {
                        System.out.print(i);
                        flag = false;
                        lock.notifyAll();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static class ThreadStr implements Runnable {

        @Override
        public void run() {

            for (int i = 97; i < 106; i++) {
                synchronized (lock) {
                    if (!flag) {
                        System.out.print((char) i);
                        flag = true;
                        lock.notifyAll();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

    }
}
