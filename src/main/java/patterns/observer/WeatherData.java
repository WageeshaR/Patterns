package patterns.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherData {
    private final PropertyChangeSupport support;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) throws InterruptedException {
        support.firePropertyChange("temperature", this.temperature, temperature);
        this.temperature = temperature;
        support.firePropertyChange("humidity", this.humidity, humidity);
        this.humidity = humidity;
        support.firePropertyChange("pressure", this.pressure, pressure);
        this.pressure = pressure;
    }
}
