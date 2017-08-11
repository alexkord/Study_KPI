package ua.kpi.task_1;

public class MushroomGlade implements State {
    @Override
    public void doAction(ManInAction manInAction) {
        manInAction.changeState(this);
    }

    @Override
    public String toString() {
        return "Mushroomer";
    }
}
