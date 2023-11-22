package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Veggies;

public class Olives extends Veggies {
    @Override
    public void description() {
        System.out.println("Best olives out there");
    }
}
