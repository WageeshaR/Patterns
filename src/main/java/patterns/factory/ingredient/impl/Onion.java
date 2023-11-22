package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Veggies;

public class Onion extends Veggies {
    @Override
    public void description() {
        System.out.println("Extra special onion");
    }
}
