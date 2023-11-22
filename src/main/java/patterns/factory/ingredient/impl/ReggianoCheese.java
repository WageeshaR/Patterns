package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Cheese;

public class ReggianoCheese extends Cheese {
    @Override
    public void description() {
        System.out.println("Special NY reggiano cheese!");
    }
}
