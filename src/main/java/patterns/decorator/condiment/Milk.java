package patterns.decorator.condiment;

import patterns.decorator.Condiment;

public class Milk extends Condiment {
    public Milk(int count) {
        super(count);
    }
    @Override
    public String getDescription() {
        return "best fresh Milk";
    }

    @Override
    public Double cost() {
        return this.beverage.cost() + (0.1 * this.getCount());
    }
}
