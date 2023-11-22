package patterns.adapter.search;

import patterns.adapter.Flight;

import java.util.List;

public interface SearchEngine {
    public void searchResults();
    public List<Flight> getResults();
}
