package patterns.state;

import patterns.state.state.State;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        GumballMachine machine = new GumballMachine();
        while (true) {
            machine.performAction();
        }
    }
}
