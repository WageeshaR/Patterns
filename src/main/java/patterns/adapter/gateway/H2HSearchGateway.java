package patterns.adapter.gateway;

import patterns.adapter.Flight;
import patterns.adapter.search.SearchEngine;
import patterns.adapter.type.H2HType;

import java.util.List;

public class H2HSearchGateway implements SearchGateway {
    private final SearchEngine h2HSearchEngine;

    public H2HSearchGateway(H2HType h2HType) {
        if (h2HType == H2HType.AMADEUS) {
            h2HSearchEngine = new AmadeusSearchAdapter();
        } else {
            h2HSearchEngine = new ExpediaSearchAdapter();
        }
    }
    @Override
    public void populateFlightResults() {
        h2HSearchEngine.searchResults();
    }

    public List<Flight> getFlightResults() {
        return h2HSearchEngine.getResults();
    }
}
