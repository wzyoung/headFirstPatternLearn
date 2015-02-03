package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 * Created by wzyoung on 2015/2/2.
 */
public class Subject implements ISubject {

    private String text;

    /**
     * 订阅者列表
     *
     */
    private List<Observer> observerList;

    public Subject() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registeListener(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeListener(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(text);
        }
    }

    @Override
    public void changed(String asdf) {
        this.text = asdf;
        notifyObserver();
    }
}
