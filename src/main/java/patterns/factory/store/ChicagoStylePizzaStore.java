package patterns.factory.store;

import patterns.factory.Pizza;
import patterns.factory.PizzaStore;
import patterns.factory.PizzaType;
import patterns.factory.type.chicago.ChicagoStyleCheesePizza;
import patterns.factory.type.chicago.ChicagoStyleMeatFeastPizza;
import patterns.factory.type.chicago.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        PizzaType pizzaType = PizzaType.valueOf(type.toUpperCase());
        Pizza pizza = null;
        switch (pizzaType) {
            case CHEESE:
                pizza = new ChicagoStyleCheesePizza();
                break;
            case VEGGIE:
                pizza = new ChicagoStyleVeggiePizza();
                break;
            case MEAT_FEAST:
                pizza = new ChicagoStyleMeatFeastPizza();
        }
        return pizza;
    }
}
