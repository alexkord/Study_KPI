package ua.kpi.task_1;

public class ManInAction {
    private State state;

    public ManInAction() {
        this.state = null;
    }

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
