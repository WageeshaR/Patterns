package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Dough;

public class ThickCrustDough extends Dough {
    @Override
    public void description() {
        System.out.println("Best thick crust dough");
    }
}
