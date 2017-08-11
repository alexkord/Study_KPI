package ua.kpi.task_1;

public class ManInAction {
    private State state;

    public ManInAction(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
