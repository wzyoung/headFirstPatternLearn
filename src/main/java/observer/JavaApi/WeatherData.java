package observer.JavaApi;

import java.util.Observable;

/**
 * Created by wzyoung on 2015/2/4.
 */
public class WeatherData extends Observable {

    private float temp;

    private float humidity;

    private float pressure;

    public WeatherData() {
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
