package ua.kpi.humanStates;

public class ManInAction {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeState(State state) {
        state.doAction(this);
    }
}
