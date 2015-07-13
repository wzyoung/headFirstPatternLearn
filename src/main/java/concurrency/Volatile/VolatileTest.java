package concurrency.Volatile;

/**
 * Created by wzyoung on 2015/7/14.
 */
public class VolatileTest {

    private static /*volatile*/ int number = 0;


    public static void main(String[] args) throws InterruptedException {


        new Thread(new Runnable() {
            @Override
            public void run() {

                while (number == 0) {

                }

            }
        }).start();


        Thread.sleep(100);

        number = 1;

    }

}
