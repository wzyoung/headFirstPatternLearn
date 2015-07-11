package CoreJava;

/**
 * 方法都没有用,方法参数复制了一份然后赋值,然并卵
 * Created by wzyoung on 2015/7/12.
 */
public class IntStrTest {


    public static void change(String a) {
        a = new String("b");
    }

    public static void change(Integer i) {
        i = new Integer(2);
    }

    public static void change(int i) {
        i = 13;
    }

    public static void main(String[] args) {


        String a = new String("a");

        Integer integer = new Integer(1);

        int i = 12;

        change(1);
        change(a);
        change(integer);

        System.out.println(a);
        System.out.println(integer);
        System.out.println(i);


    }

}
