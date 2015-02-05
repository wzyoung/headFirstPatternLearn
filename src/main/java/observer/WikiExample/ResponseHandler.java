package observer.WikiExample;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wzyoung on 2015/2/5.
 */
public class ResponseHandler implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            String resp = (String) arg;
            System.out.println(resp);
        }
    }
}
