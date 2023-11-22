package patterns.adapter.gateway;

import patterns.adapter.Flight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface SearchGateway {
    public void populateFlightResults();

    public List<Flight> getFlightResults();
}
