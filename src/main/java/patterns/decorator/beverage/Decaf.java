package patterns.decorator.beverage;

import patterns.decorator.Beverage;

public class Decaf implements Beverage {
    public String getDescription() {
        return "Best Decaf in town!";
    }

    @Override
    public Double cost() {
        return 0.95;
    }
}
