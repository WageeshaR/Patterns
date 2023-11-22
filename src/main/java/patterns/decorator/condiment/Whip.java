package patterns.decorator.condiment;

import patterns.decorator.Condiment;

public class Whip extends Condiment {
    public Whip(int count) {
        super(count);
    }
    @Override
    public String getDescription() {
        return "super creamy Whip!";
    }

    @Override
    public Double cost() {
        return this.beverage.cost() + (0.1 * this.getCount());
    }
}
