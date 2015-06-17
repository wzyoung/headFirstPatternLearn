package singleton.DClExample;

/**
 * Created by wzyoung on 2014/12/15.
 * <p/>
 * 单例模式 double-checked-locking
 */
public class SingleInstanceDCL {

    private static volatile SingleInstanceDCL instanceDCL;

    private SingleInstanceDCL() {
    }

    public static SingleInstanceDCL getInstanceDCL() {

        if (null == instanceDCL) {
            synchronized (SingleInstanceDCL.class) {
                if (null == instanceDCL) {
                    instanceDCL = new SingleInstanceDCL();
                }
            }

        }

        return instanceDCL;

    }

}
