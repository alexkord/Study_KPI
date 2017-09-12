package ua.kpi.humanStates;

public class MushroomGlade implements State {

    @Override
    public void doAction(ManInAction manInAction) {
        manInAction.setState(this);
    }

    @Override
    public String toString() {
        return "Mushroomer";
    }
}
