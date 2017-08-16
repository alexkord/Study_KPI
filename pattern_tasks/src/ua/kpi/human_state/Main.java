package ua.kpi.human_state;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ManInAction manInAction =  new ManInAction();
        RiverShore riverShore = new RiverShore();
        riverShore.doAction(manInAction);
        System.out.println(manInAction.getState());
    }
}
