package exceptionTest;

/**
 * Created by wzyoung on 2015/6/17.
 */
public class TestClient {

    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();


        try {
            exceptionTest.test();
        } finally {
            System.out.println("finally~~~");
        }

    }
}
