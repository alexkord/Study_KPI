package car_model;

public abstract class Component {
    int currentComponentResourse;

    public Component(int currentComponentResourse) {
        this.currentComponentResourse = currentComponentResourse;
    }

    public int getComponentResourse() {
        return currentComponentResourse;
    }

    public void setComponentResourse(int componentResourse) {
        this.currentComponentResourse = currentComponentResourse;
    }
}
