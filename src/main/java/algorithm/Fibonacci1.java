package algorithm;

/**
 * Created by wzyoung on 2015/7/9.
 */
public class Fibonacci1 {

    public static void main(String[] args) {

        // test
        int i = 20;

        for (int j = 1; j <= i; j++) {
//            System.out.println(getFibo(j));
        }

        System.out.println(getFibo(1));

    }


    private static int getFibo(int i) {

        if (1 == i || 2 == i) {
            return 1;
        } else {
            return getFibo(i - 1) + getFibo(i - 2);
        }

    }

}
