package patterns.adapter.gateway;

import patterns.adapter.Flight;
import patterns.adapter.h2h.expedia.ExpediaFlight;
import patterns.adapter.h2h.expedia.ExpediaSearchGateway;
import patterns.adapter.h2h.expedia.ExpediaSearchGatewayImpl;
import patterns.adapter.search.SearchEngine;

import java.util.ArrayList;
import java.util.List;

public class ExpediaSearchAdapter implements SearchEngine {
    private final ExpediaSearchGateway expediaSearchGateway;

    public ExpediaSearchAdapter() {
        this.expediaSearchGateway = new ExpediaSearchGatewayImpl();
    }

    @Override
    public void searchResults() {
        expediaSearchGateway.iterableFlightResult();
    }

    public List<Flight> getResults() {
        List<Flight> localFlights = new ArrayList<>();
        for (ExpediaFlight flight: expediaSearchGateway.getIterableResult()) {
            Flight localFlight = new Flight(flight.getFlightClass(), flight.getCode());
            localFlights.add(localFlight);
        }
        return localFlights;
    }
}
