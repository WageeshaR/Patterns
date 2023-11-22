package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Veggies;

public class Peppers extends Veggies {
    @Override
    public void description() {
        System.out.println("Special peppers");
    }
}
