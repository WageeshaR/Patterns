package patterns.observer;

import patterns.observer.observer.CurrentConditionsDisplay;
import patterns.observer.observer.StatisticsDisplay;

import java.util.concurrent.TimeUnit;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        // update measurements
        weatherData.setMeasurements(30.2f, 60, 100);
        TimeUnit.SECONDS.sleep(2);
        weatherData.setMeasurements(30.5f, 57, 109);

        // remove current conditions display from subscribers list
        currentConditionsDisplay.unsubscribe();
        TimeUnit.SECONDS.sleep(2);
        weatherData.setMeasurements(30.3f, 59, 103);
    }
}
