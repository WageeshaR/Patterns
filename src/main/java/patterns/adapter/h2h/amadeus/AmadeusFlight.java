package patterns.adapter.h2h.amadeus;

public class AmadeusFlight {
    private String model;
    private String number;

    public AmadeusFlight(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }
}
