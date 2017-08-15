package ua.kpi.task_2;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ManInAction manInAction =  new ManInAction();
        AnimalViewer animalViewer = new AnimalViewer();
        animalViewer.doAction(manInAction);
        System.out.println(manInAction.getState());
    }
}
