package observer.WikiExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

/**
 * 发布者,事件源
 * Created by wzyoung on 2015/2/5.
 */
public class EventSource extends Observable implements Runnable {


    @Override
    public void run() {
        final InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        final BufferedReader bf = new BufferedReader(inputStreamReader);

        while (true) {
            try {
                String response = bf.readLine();
                setChanged();
                notifyObservers(response);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
