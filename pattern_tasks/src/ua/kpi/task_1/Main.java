package ua.kpi.task_1;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ManInAction manInAction =  new ManInAction();
        manInAction.setState(new RiverShore());
        System.out.println(manInAction.getState());
        manInAction.setState(new MushroomGlade());
        System.out.println(manInAction.getState());
        manInAction.setState(new AnimalViewer());
        System.out.println(manInAction.getState());
    }
}
