package patterns.decorator.beverage;

import patterns.decorator.Beverage;

public class Espresso implements Beverage {
    public String getDescription() {
        return "Best Expresso in town!";
    }

    @Override
    public Double cost() {
        return 0.85;
    }
}
