package patterns.observer.observer;

import patterns.observer.WeatherData;
import patterns.observer.custom.DisplayElement;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Objects;

public class StatisticsDisplay implements PropertyChangeListener, DisplayElement {
    public float temperature;
    public float humidity;
    public float pressure;
    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addPropertyChangeListener(this);
    }

    public void unsubscribe() {
        weatherData.removePropertyChangeListener(this);
    }

    @Override
    public void display() {
        if (temperature == 0.0f || humidity == 0.0f || pressure == 0.0f) {
            System.out.println("No values set for statistics!");
        }
        float average = temperature + humidity + pressure;
        System.out.println("statistic is: " + average);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (Objects.equals(evt.getPropertyName(), "temperature")) {
            setTemperature((float) evt.getNewValue());
        }
        if (Objects.equals(evt.getPropertyName(), "humidity")) {
            setHumidity((float) evt.getNewValue());
        }
        if (Objects.equals(evt.getPropertyName(), "pressure")) {
            setPressure((float) evt.getNewValue());
        }
        display();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
