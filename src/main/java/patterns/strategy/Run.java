package patterns.strategy;

import patterns.strategy.behaviour.impl.Floating;
import patterns.strategy.type.MallardDuck;
import patterns.strategy.type.RubberDuck;

public class Run {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        mallardDuck.display();
        System.out.println("\n");
        rubberDuck.display();

        // Mallard duck wants to try a new flying behaviour
        mallardDuck.setFlyBehaviour(new Floating());
        System.out.println("\n");
        mallardDuck.performFly();
    }
}
