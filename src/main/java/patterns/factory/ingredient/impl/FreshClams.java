package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Clams;

public class FreshClams extends Clams {
    @Override
    public void description() {
        System.out.println("Special NY fresh clams!");
    }
}
