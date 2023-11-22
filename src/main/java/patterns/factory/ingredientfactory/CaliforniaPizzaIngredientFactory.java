package patterns.factory.ingredientfactory;

import patterns.factory.ingredient.*;
import patterns.factory.ingredient.impl.*;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new VeryThinCrust();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Clams createClams() {
        return new Calamari();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Carrot(), new Onion(), new Olives()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }
}
