package observer.JavaApi;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wzyoung on 2015/2/4.
 */
public class CurrentyConditionsDisplay implements Observer {

    Observable observable;

    private float temp;

    private float humidity;

    private float pressure;

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData data = (WeatherData)o;
            this.pressure = data.getPressure();
            this.temp  = data.getTemp();
            this.humidity = data.getHumidity();
            display();
        }
    }

    public CurrentyConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("temp:" + temp + ",humidity:" + humidity);
    }
}
