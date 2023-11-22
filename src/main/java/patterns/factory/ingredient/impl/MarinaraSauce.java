package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Sauce;

public class MarinaraSauce extends Sauce {
    @Override
    public void description() {
        System.out.println("Special marinara sauce");
    }
}
