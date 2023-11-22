package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Dough;

public class VeryThinCrust extends Dough {
    @Override
    public void description() {
        System.out.println("Very thin crust dough");
    }
}
