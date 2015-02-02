package singleton.client;

import singleton.CommonExample.SingleInstance;
import singleton.DClExample.SingleInstanceDCL;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * Created by wzyoung on 2014/12/13.
 */
public class Client {

    static Set set;

    static Set set2;

    public static void main(String[] args) {

        int threadCount = 10000;
        set = new HashSet();
//        set = Collections.synchronizedSet(set);

        for (int i = 0; i < threadCount; i++)
            new Thread() {
                @Override
                public void run() {
                    SingleInstance instance = SingleInstance.getInstance();
                    System.out.println(instance.hashCode());
                }
//                1071218428
            }.start();
        System.out.println("=================");
        set2 = new HashSet();
        for (int i = 0; i < 1000000; i++) {
            if (set2.add("a")) {
                System.out.println("add");
            }
        }

        System.out.println(set2.size());
        System.out.println(set2);
    }
}
