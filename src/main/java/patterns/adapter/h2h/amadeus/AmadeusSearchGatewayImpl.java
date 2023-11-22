package patterns.adapter.h2h.amadeus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmadeusSearchGatewayImpl implements AmadeusSearchGateway {
    private List<AmadeusFlight> flights;
    @Override
    public void generateFlightResults() {
        this.flights = new ArrayList<>(Arrays.asList(new AmadeusFlight("Boeing", "787"), new AmadeusFlight("Airbus", "380")));
    }

    @Override
    public List<AmadeusFlight> getResults() {
        return flights;
    }
}
