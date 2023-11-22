package patterns.factory.ingredientfactory;

import patterns.factory.ingredient.*;
import patterns.factory.ingredient.impl.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Olives(), new Peppers()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }
}
