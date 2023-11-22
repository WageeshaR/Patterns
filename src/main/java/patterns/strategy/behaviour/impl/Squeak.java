package patterns.strategy.behaviour.impl;

import patterns.strategy.behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    private String sound = "squeeee...";
    @Override
    public void quack() {
        System.out.println("I squeak with sound " + this.sound);
    }

    private void setSound(String sound) {
        this.sound = sound;
    }

    private String getSound() {
        return this.sound;
    }
}
