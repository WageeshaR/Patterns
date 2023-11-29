package patterns.state.state;

import patterns.state.Action;
import patterns.state.GumballMachine;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class GumballSold implements State {
    private List<Action> availableActions;
    private GumballMachine gumballMachine;
    public GumballSold(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        availableActions = new ArrayList<>();
        availableActions.add(Action.DISPENSE_GUMBALL);
    }

    @Override
    public void next(Action action) {
        try {
            switch (action) {
                case DISPENSE_GUMBALL -> {
                    if (gumballMachine.getGumballCount() > 0) {
                        gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
                    } else {
                        gumballMachine.setCurrentState(gumballMachine.getOutOfGumballs());
                    }
                }
                case EJECT_QUARTER, TURNS_CRANK, INSERT_QUARTER -> throw new OperationNotSupportedException();
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
        System.out.println("I'm gumball sold state. Below are acceptable actions for me:");
        for (Action action: availableActions) {
            System.out.println("* " + action.name());
        }
    }
}
