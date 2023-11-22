package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Cheese;

public class MozzarellaCheese extends Cheese {
    @Override
    public void description() {
        System.out.println("Special mozzarella cheese");
    }
}
