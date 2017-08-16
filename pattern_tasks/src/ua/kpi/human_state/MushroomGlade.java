package ua.kpi.human_state;

public class MushroomGlade implements State {

    @Override
    public void doAction(ManInAction manInAction) {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Mushroomer";
    }
}
