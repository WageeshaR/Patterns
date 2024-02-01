package phase2.observer;

import phase2.observer.listeners.BBC;
import phase2.observer.listeners.CNBC;
import phase2.observer.observable.WeatherReporter;

public class ObserverSimulator {

    public void simulate() {
        WeatherReporter reporter = new WeatherReporter();
        reporter.setPropertyChangeSupport();

        BBC bbcListener = new BBC();
        CNBC cnbcListener = new CNBC();

        reporter.addPropertyChangeListener(bbcListener);
        reporter.addPropertyChangeListener(cnbcListener);

        reporter.addNewDatabaseChange("New table rain created\n");
        
        System.out.println("Length of BBC news: " + bbcListener.getNewsList().size());
        System.out.println("Length of CNBC news: " + cnbcListener.getWeatherNews().size());

        reporter.addNewDatabaseChange("\nNew table clouds created\n");
        
        System.out.println("Length of BBC news: " + bbcListener.getNewsList().size());
        System.out.println("Length of CNBC news: " + cnbcListener.getWeatherNews().size());
    }

}
