package patterns.factory.store;

import patterns.factory.Pizza;
import patterns.factory.PizzaStore;
import patterns.factory.PizzaType;
import patterns.factory.type.ny.NYStyleCheesePizza;
import patterns.factory.type.ny.NYStyleMeatFeastPizza;
import patterns.factory.type.ny.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        PizzaType pizzaType = PizzaType.valueOf(type.toUpperCase());
        Pizza pizza = null;
        switch (pizzaType) {
            case CHEESE:
                pizza = new NYStyleCheesePizza();
                break;
            case VEGGIE:
                pizza = new NYStyleVeggiePizza();
                break;
            case MEAT_FEAST:
                pizza = new NYStyleMeatFeastPizza();
        }
        return pizza;
    }
}
