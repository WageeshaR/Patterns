package phase2.observer.observable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherReporter {

    private PropertyChangeSupport propertyChangeSupport;

    private String change;

    public void setPropertyChangeSupport() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void addNewDatabaseChange(String newChange) {
        this.propertyChangeSupport.firePropertyChange("change", change, newChange);
        
        this.change = newChange;
    }
    
}
