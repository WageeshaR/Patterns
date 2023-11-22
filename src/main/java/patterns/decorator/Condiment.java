package patterns.decorator;

public abstract class Condiment implements Beverage {
    protected Beverage beverage;
    private int count;

    public Condiment(int count) {
        this.count = count;
    }

    public String getDescription() {
        return "Best condiments you can have!";
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
