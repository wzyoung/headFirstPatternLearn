package SpringAssert;

import org.springframework.util.Assert;

/**
 * Created by wzyoung on 2015/8/27.
 */
public class TestSpringAssert {

    public static void main(String[] args) {
        try{
            testAssert();
        }
        catch (IllegalArgumentException e) {
            System.out.println("gota");
        }
    }


    public static void testAssert() {
        String a = null;
        Assert.hasLength(a, "is null");
    }
}
