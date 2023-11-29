package patterns.state.state;

import patterns.state.Action;
import patterns.state.GumballMachine;

import java.util.ArrayList;
import java.util.List;

public class OutOfGumballs implements State {
    private List<Action> availableActions;
    private GumballMachine gumballMachine;
    public OutOfGumballs(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        availableActions = new ArrayList<>();
    }
    @Override
    public void next(Action action) {
        gumballMachine.getCurrentState().display();
    }

    @Override
    public void add(Action action) {
        availableActions.add(action);
    }

    @Override
    public void display() {
        System.out.println("I'm out of gumballs state. There are no further actions.");
    }
}
