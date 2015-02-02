package singleton.CommonExample;

/**
 * Created by wzyoung on 2014/12/15.
 */
public class SingleInstance {

    private SingleInstance() {

    }

    private static SingleInstance instance;

    public static SingleInstance getInstance() {

        if (null == instance) {
            synchronized (SingleInstance.class) {
                if (null == instance)
                    instance = new SingleInstance();
            }

        }
        return instance;
    }

}
