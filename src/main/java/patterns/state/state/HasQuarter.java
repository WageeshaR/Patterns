package patterns.state.state;

import patterns.state.Action;
import patterns.state.GumballMachine;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class HasQuarter implements State {
    private List<Action> availableActions;
    private GumballMachine gumballMachine;
    public HasQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        availableActions = new ArrayList<>();
        availableActions.add(Action.EJECT_QUARTER);
        availableActions.add(Action.TURNS_CRANK);
    }

    @Override
    public void next(Action action) {
        try {
            switch (action) {
                case EJECT_QUARTER -> {
                    gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
                }
                case TURNS_CRANK -> {
                    gumballMachine.setCurrentState(gumballMachine.getGumballSold());
                    gumballMachine.setGumballCount(gumballMachine.getGumballCount() - 1);
                }
                case INSERT_QUARTER, DISPENSE_GUMBALL -> throw new OperationNotSupportedException();
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
        System.out.println("I'm has quarter state. Below are acceptable actions for me:");
        for (Action action: availableActions) {
            System.out.println("* " + action.name());
        }
    }
}
