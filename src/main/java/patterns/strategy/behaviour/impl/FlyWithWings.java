package patterns.strategy.behaviour.impl;

import patterns.strategy.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings.");
    }
}
