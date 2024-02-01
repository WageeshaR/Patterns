package phase2.observer.listeners;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class BBC implements PropertyChangeListener {

    private List<String> newsList;

    public BBC() {
        this.newsList = new ArrayList<>();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.newsList.add((String) evt.getNewValue());
    }

    public List<String> getNewsList() {
        return newsList;
    }
    
}
