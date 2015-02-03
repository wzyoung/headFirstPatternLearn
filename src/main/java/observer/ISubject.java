package observer;

/**
 *
 * Created by wzyoung on 2015/2/3.
 */
public interface ISubject {

    public void registeListener(Observer o);

    public void removeListener(Observer o);

    public void notifyObserver();

    void changed(String asdf);
}
