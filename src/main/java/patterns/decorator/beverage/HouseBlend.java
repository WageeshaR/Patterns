package patterns.decorator.beverage;

import patterns.decorator.Beverage;

public class HouseBlend implements Beverage {
    public String getDescription() {
        return "Best HouseBlend coffee in town!";
    }

    @Override
    public Double cost() {
        return 0.89;
    }
}
