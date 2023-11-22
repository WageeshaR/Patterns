package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Clams;

public class Calamari extends Clams {
    @Override
    public void description() {
        System.out.println("Special calamari from CA");
    }
}
