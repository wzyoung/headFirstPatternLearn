package observer.Example;

/**
 * Created by wzyoung on 2015/2/2.
 */
public class Observer {


    private String text;

    public void update(String text) {
        this.text = text;
        System.out.println(text);
    }


}
