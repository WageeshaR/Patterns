package patterns.factory.ingredientfactory;

import patterns.factory.ingredient.*;
import patterns.factory.ingredient.impl.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Onion(), new Carrot(), new Peppers()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }
}
