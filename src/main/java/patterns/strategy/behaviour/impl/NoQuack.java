package patterns.strategy.behaviour.impl;

import patterns.strategy.behaviour.QuackBehaviour;

public class NoQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I don't quack.");
    }
}
