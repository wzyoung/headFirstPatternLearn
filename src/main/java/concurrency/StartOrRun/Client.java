package concurrency.StartOrRun;

import java.io.BufferedReader;
import java.io.File;

/**
 * Created by wzyoung on 2014/12/17.
 */
public class Client {


    public static void main(String[] args) {

        Thread thread = new Thread(new ThreadTest());
        new ThreadTest().run();

        thread.start();

        TestThread t = new TestThread("asdf");

        t.start();

        for(int i=0;i<20;i++) {

        }

               File file = new File("D:\\A.java");

        System.out.println(file.exists());

    }


}
