package chainOfResponsibility;

/**
 * Created by wzyoung on 2015/7/2.
 */
public abstract class BaseService {


    private BaseService nextHandler;


    public void handle() {

        doSomething();

        if (null != nextHandler) {
            nextHandler.handle();
        }
    }


    public abstract void doSomething();


    public BaseService getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(BaseService nextHandler) {
        this.nextHandler = nextHandler;
    }

}
