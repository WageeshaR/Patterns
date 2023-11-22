package patterns.strategy.behaviour.impl;

import patterns.strategy.behaviour.FlyBehaviour;

public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I don't fly.");
    }
}
