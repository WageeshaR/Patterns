package patterns.factory.ingredientfactory;

import patterns.factory.ingredient.*;
import patterns.factory.ingredient.impl.Pepperoni;

public interface PizzaIngredientFactory {
    Dough createDough();
    Cheese createCheese();
    Clams createClams();
    Sauce createSauce();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
}
