package patterns.state.state;

import patterns.state.Action;

public interface State {
    void next(Action action);
    void add(Action action);
    void display();
}
