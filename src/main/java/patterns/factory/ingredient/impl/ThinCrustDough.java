package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Dough;

public class ThinCrustDough extends Dough {
    @Override
    public void description() {
        System.out.println("Special NY thin crust dough");
    }
}
