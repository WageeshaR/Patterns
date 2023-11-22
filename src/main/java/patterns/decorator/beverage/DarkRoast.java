package patterns.decorator.beverage;

import patterns.decorator.Beverage;

public class DarkRoast implements Beverage {
    public String getDescription() {
        return "Best DarkRoast coffee in town!";
    }

    @Override
    public Double cost() {
        return 0.99;
    }
}
