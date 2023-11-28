package patterns.strategy.type;

import patterns.strategy.Duck;
import patterns.strategy.behaviour.FlyBehaviour;
import patterns.strategy.behaviour.QuackBehaviour;
import patterns.strategy.behaviour.impl.FlyWithWings;
import patterns.strategy.behaviour.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
        this.type = "Mallard";
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public FlyBehaviour getFlyBehaviour() {
        return this.flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return this.quackBehaviour;
    }
}
