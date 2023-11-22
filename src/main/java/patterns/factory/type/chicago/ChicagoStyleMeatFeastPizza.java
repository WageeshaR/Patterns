package patterns.factory.type.chicago;

import patterns.factory.Pizza;
import patterns.factory.ingredientfactory.ChicagoPizzaIngredientFactory;

public class ChicagoStyleMeatFeastPizza extends Pizza {
    public ChicagoStyleMeatFeastPizza() {
        this.ingredientFactory = new ChicagoPizzaIngredientFactory();
    }
    @Override
    public void prepare() {
        System.out.println("Preparing Chicago Style Meat Feast Pizza...");
        ingredientFactory.createDough().description();
        ingredientFactory.createSauce().description();
        ingredientFactory.createCheese().description();
        ingredientFactory.createPepperoni().description();
        ingredientFactory.createClams().description();
        ingredientFactory.createVeggies();
    }

    @Override
    public void bake() {
        System.out.println("Baking in Chicago style...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting in Chicago style...");
    }

    @Override
    public void box() {
        System.out.println("Boxing in Chicago style... don't wait no more.");
    }
}
