package observer.WikiExample;

/**
 * Created by wzyoung on 2015/2/5.
 */
public class TestClient {

    public static void main(String[] args) {

        System.out.println("Enter Text >>");

        EventSource eventSource = new EventSource();

        ResponseHandler responseHandler = new ResponseHandler();

        eventSource.addObserver(responseHandler);

        Thread thread = new Thread(eventSource);
        thread.start();

    }
}
