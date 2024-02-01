package phase2.observer.listeners;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CNBC implements PropertyChangeListener {

    private Map<String, List<String>> newsMap;

    public CNBC() {
        this.newsMap = new HashMap<>();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        List<String> weatherNews = newsMap.computeIfAbsent("weather", k -> new ArrayList<>());
        weatherNews.add((String) evt.getNewValue());
    }

    public List<String> getWeatherNews() {
        return newsMap.getOrDefault("weather", List.of());
    }
    
}
