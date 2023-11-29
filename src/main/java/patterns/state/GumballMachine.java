package patterns.state;

import patterns.state.state.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class GumballMachine {
    private State noQuarter;
    private State hasQuarter;
    private State gumballSold;
    private State outOfGumballs;
    private State currentState;
    private int gumballCount;

    public GumballMachine() {
        noQuarter = new NoQuarter(this);
        hasQuarter = new HasQuarter(this);
        gumballSold = new GumballSold(this);
        outOfGumballs = new OutOfGumballs(this);
        setCurrentState(noQuarter);
        gumballCount = 2;
    }

    public void performAction() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        try {
            Action action = Action.valueOf(input.toUpperCase());
            currentState.next(action);
        } catch (IllegalArgumentException e) {
            System.out.println("Please perform a valid action.");
        }
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State state) {
        state.display();
        this.currentState = state;
    }

    public State getNoQuarter() {
        return noQuarter;
    }

    public State getHasQuarter() {
        return hasQuarter;
    }

    public State getGumballSold() {
        return gumballSold;
    }

    public State getOutOfGumballs() {
        return outOfGumballs;
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public void setGumballCount(int gumballCount) {
        this.gumballCount = gumballCount;
    }
}
