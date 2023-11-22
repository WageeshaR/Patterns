package patterns.adapter.h2h.expedia;

import patterns.adapter.h2h.amadeus.AmadeusFlight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExpediaSearchGatewayImpl implements ExpediaSearchGateway {
    private List<ExpediaFlight> results;
    @Override
    public void iterableFlightResult() {
        this.results = new ArrayList<>(Arrays.asList(new ExpediaFlight("Boeing", "787"), new ExpediaFlight("Airbus", "380")));
    }

    @Override
    public List<ExpediaFlight> getIterableResult() {
        return results;
    }
}
