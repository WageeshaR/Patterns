package patterns.decorator.condiment;

import patterns.decorator.Condiment;

public class Mocha extends Condiment {

    public Mocha(int count) {
        super(count);
    }
    @Override
    public String getDescription() {
        return "best tasting mocha!";
    }

    @Override
    public Double cost() {
        return this.beverage.cost() + (0.2 * this.getCount());
    }
}
