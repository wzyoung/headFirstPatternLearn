package concurrency.Thread;

import concurrency.StartOrRun.ThreadTest;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 编写两个线程,一个是1-9,一个是a-i 运行结果为,1a2b3c4d5e6f7g8h9i
 * Created by wzyoung on 2015/7/11.
 */
public class ThreadRunOneByOne {

    private volatile static boolean flag = false;


    public static void main(String[] args) {


        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new ThreadStr(flag));
        executorService.execute(new ThreadInt(!flag));


        executorService.shutdown();


    }


    public static class ThreadInt implements Runnable {

        boolean flag = false;

        public ThreadInt(boolean flag) {
            this.flag = flag;
        }

        @Override
        public void run() {
            for (int i = 1; i < 10; i++) {

                if (flag) {
                    try {
                        System.out.print(i);
                        flag = false;
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    notifyAll();
                }


            }
        }
    }


    public static class ThreadStr implements Runnable {
        boolean flag = false;

        public ThreadStr(boolean flag) {
            this.flag = flag;
        }

        @Override
        public void run() {
            for (int i = 97; i < 106; i++) {

                if (!flag) {
                    try {
                        System.out.print((char) i);
                        wait();
                        flag = true;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    notifyAll();
                }


            }

        }
    }

}
