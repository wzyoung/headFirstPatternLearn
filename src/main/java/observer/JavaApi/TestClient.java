package observer.JavaApi;

import java.util.Observable;

/**
 *
 * Created by wzyoung on 2015/2/4.
 */
public class TestClient {
    public static void main(String[] args) {

        Observable observable = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(observable);

        ((WeatherData)observable).setMeasurements(12,12,12);
    }
}
