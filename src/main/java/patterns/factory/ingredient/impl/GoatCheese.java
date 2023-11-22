package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Cheese;

public class GoatCheese extends Cheese {
    @Override
    public void description() {
        System.out.println("Best goat cheese");
    }
}
