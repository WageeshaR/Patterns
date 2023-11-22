package patterns.factory;

import patterns.factory.ingredientfactory.PizzaIngredientFactory;

public abstract class Pizza {
    protected PizzaIngredientFactory ingredientFactory;
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
