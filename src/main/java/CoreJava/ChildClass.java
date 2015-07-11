package CoreJava;


/**
 * 子类重写了父类方法,在构造时候会执行重写的子类方法,如果该方法在构造器中
 * Created by wzyoung on 2015/7/12.
 */
public class ChildClass extends ParentClass {

    public ChildClass() {
        test();

    }

    public void test() {
        System.out.println("create child");
    }


    public static void main(String[] args) {

        ParentClass clasz = new ChildClass();

    }
}
