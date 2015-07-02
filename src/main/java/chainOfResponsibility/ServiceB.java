package chainOfResponsibility;

/**
 * Created by wzyoung on 2015/7/2.
 */
public class ServiceB extends BaseService{
    @Override
    public void doSomething() {
        System.out.println("ServiceB do something!");
    }
}
