package patterns.factory.type.ny;

import patterns.factory.Pizza;
import patterns.factory.ingredientfactory.NYPizzaIngredientFactory;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        this.ingredientFactory = new NYPizzaIngredientFactory();
    }
    @Override
    public void prepare() {
        System.out.println("Preparing NY Style Veggie Pizza...");
        ingredientFactory.createDough().description();
        ingredientFactory.createSauce().description();
        ingredientFactory.createCheese().description();
        ingredientFactory.createPepperoni().description();
        ingredientFactory.createClams().description();
        ingredientFactory.createVeggies();
    }

    @Override
    public void bake() {
        System.out.println("Baking in NY style...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting in NY style...");
    }

    @Override
    public void box() {
        System.out.println("Boxing in NY style... your pizza is almost there.");
    }
}
