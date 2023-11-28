package patterns.strategy;

import patterns.strategy.behaviour.FlyBehaviour;
import patterns.strategy.behaviour.QuackBehaviour;

public abstract class Duck {
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    protected String type;

    public void swim() {
        System.out.println("I'm swimming.");
    }

    public void display() {
        System.out.println("I'm a " + type + " duck.");
        this.performFly();
        this.performQuack();
    }

    public void performFly() {
        if (flyBehaviour != null) flyBehaviour.fly();
        else System.out.println("I don't perform any of the fly behaviours.");
    }

    public void performQuack() {
        if (quackBehaviour != null) quackBehaviour.quack();
        else System.out.println("I don't perform any of the quack behaviours.");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {}
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {}
}
