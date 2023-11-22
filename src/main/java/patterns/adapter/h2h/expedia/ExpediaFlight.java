package patterns.adapter.h2h.expedia;

public class ExpediaFlight {
    private String flightClass;
    private String code;

    public ExpediaFlight(String flightClass, String code) {
        this.flightClass = flightClass;
        this.code = code;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public String getCode() {
        return code;
    }
}
