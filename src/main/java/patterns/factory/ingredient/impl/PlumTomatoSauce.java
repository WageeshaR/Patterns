package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Sauce;

public class PlumTomatoSauce extends Sauce {
    @Override
    public void description() {
        System.out.println("Best plum tomato sauce");
    }
}
