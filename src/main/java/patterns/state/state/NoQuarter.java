package patterns.state.state;

import patterns.state.Action;
import patterns.state.GumballMachine;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class NoQuarter implements State {
    private List<Action> availableActions;
    private GumballMachine gumballMachine;
    public NoQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        availableActions = new ArrayList<>();
        availableActions.add(Action.INSERT_QUARTER);
    }

    @Override
    public void next(Action action) {
        try {
            switch (action) {
                case INSERT_QUARTER -> {
                    gumballMachine.setCurrentState(gumballMachine.getHasQuarter());
                }
                case EJECT_QUARTER, TURNS_CRANK, DISPENSE_GUMBALL -> throw new OperationNotSupportedException();
            }
        } catch (OperationNotSupportedException ignored) {
            gumballMachine.getCurrentState().display();
        }
    }

    @Override
    public void add(Action action) {
        availableActions.add(action);
    }

    @Override
    public void display() {
        System.out.println("I'm no quarter state. Below are acceptable actions for me:");
        for (Action action: availableActions) {
            System.out.println("* " + action.name());
        }
    }
}
