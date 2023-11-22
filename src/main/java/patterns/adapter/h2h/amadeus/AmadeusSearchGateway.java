package patterns.adapter.h2h.amadeus;

import java.util.List;

public interface AmadeusSearchGateway {
    public void generateFlightResults();
    public List<AmadeusFlight> getResults();
}
