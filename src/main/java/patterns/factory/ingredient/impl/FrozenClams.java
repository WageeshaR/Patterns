package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Clams;

public class FrozenClams extends Clams {
    @Override
    public void description() {
        System.out.println("Special frozen clams");
    }
}
