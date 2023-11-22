package patterns.adapter.gateway;

import patterns.adapter.Flight;
import patterns.adapter.h2h.amadeus.AmadeusFlight;
import patterns.adapter.h2h.amadeus.AmadeusSearchGateway;
import patterns.adapter.h2h.amadeus.AmadeusSearchGatewayImpl;
import patterns.adapter.search.SearchEngine;

import java.util.ArrayList;
import java.util.List;

public class AmadeusSearchAdapter implements SearchEngine {
    private final AmadeusSearchGateway amadeusSearchGateway;
    
    public AmadeusSearchAdapter() {
        amadeusSearchGateway = new AmadeusSearchGatewayImpl();
    }
    @Override
    public void searchResults() {
        amadeusSearchGateway.generateFlightResults();
    }

    @Override
    public List<Flight> getResults() {
        List<Flight> localFlights = new ArrayList<>();
        for (AmadeusFlight flight: amadeusSearchGateway.getResults()) {
            Flight localFlight = new Flight(flight.getModel(), flight.getNumber());
            localFlights.add(localFlight);
        }
        return localFlights;
    }
}
