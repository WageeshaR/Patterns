package patterns.factory;

public abstract class PizzaStore {
    public void orderPizza(String type) {
        Pizza pizza = this.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public abstract Pizza createPizza(String type);
}
