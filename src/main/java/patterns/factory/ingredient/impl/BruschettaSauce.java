package patterns.factory.ingredient.impl;

import patterns.factory.ingredient.Sauce;

public class BruschettaSauce extends Sauce {
    @Override
    public void description() {
        System.out.println("Special Bruschetta sauce");
    }
}
