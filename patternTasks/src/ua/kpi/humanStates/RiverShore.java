package ua.kpi.humanStates;

public class RiverShore implements State {

    @Override
    public void doAction(ManInAction manInAction) {
        manInAction.setState(this);
    }

    @Override
    public String toString() {
        return "Fisher";
    }
}
