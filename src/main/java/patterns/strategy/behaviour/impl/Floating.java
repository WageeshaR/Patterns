package patterns.strategy.behaviour.impl;

import patterns.strategy.behaviour.FlyBehaviour;

public class Floating implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm floating.");
    }
}
