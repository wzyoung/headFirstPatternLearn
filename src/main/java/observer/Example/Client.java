package observer.Example;

/**
 * Created by wzyoung on 2015/2/2.
 */
public class Client {

    public static void main(String[] args) {

        CatObserver catObserver = new CatObserver();

        DogObserver dogObserver = new DogObserver();

        MouseObserver mouseObserver = new MouseObserver();

        ISubject subject = new Subject();

        subject.registeListener(catObserver);

        subject.registeListener(dogObserver);

        subject.registeListener(mouseObserver);

        subject.changed("asdf");
    }
}
