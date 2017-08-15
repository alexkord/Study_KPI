package ua.kpi.task_2;

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
