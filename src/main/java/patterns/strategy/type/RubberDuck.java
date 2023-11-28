package patterns.strategy.type;

import patterns.strategy.Duck;
import patterns.strategy.behaviour.impl.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehaviour = null;
        this.quackBehaviour = new Squeak();
        this.type = "Rubber";
    }
}
