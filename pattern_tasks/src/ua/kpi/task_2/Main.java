package ua.kpi.task_2;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ManInAction manInAction =  new ManInAction();
        manInAction.setState(new RiverShore());
        manInAction.changeState(new AnimalViewer());
        System.out.println(manInAction.getState());
    }
}
