package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Veggies;

public class Carrot extends Veggies {
    @Override
    public void description() {
        System.out.println("Best carrots out there");
    }
}
