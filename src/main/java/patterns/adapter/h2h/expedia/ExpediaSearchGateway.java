package patterns.adapter.h2h.expedia;

import java.util.List;

public interface ExpediaSearchGateway {
    public void iterableFlightResult();
    public List<ExpediaFlight> getIterableResult();
}
