package patterns.decorator.condiment;

import patterns.decorator.Condiment;

public class Soy extends Condiment {
    public Soy(int count) {
        super(count);
    }
    @Override
    public String getDescription() {
        return "great flavoured Soy!";
    }

    @Override
    public Double cost() {
        return this.beverage.cost() + (0.15 * this.getCount());
    }
}
