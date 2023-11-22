package patterns.strategy.behaviour.impl;

import patterns.strategy.behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {
    private int loudness = 5;
    @Override
    public void quack() {
        System.out.println("I quack with loudness " + this.loudness);
    }

    private void setLoudness(int loudness) {
        this.loudness = loudness;
    }

    private int getLoudness() {
        return this.loudness;
    }
}
