package entity.car_model;

public abstract class Component {
    int currentComponentResourse;
    boolean isNeedFix;

    public Component(int currentComponentResourse) {
        this.currentComponentResourse = currentComponentResourse;
    }

    public int getCurrentComponentResourse() {
        return currentComponentResourse;
    }

    public void setComponentResourse(int componentResourse) {
        this.currentComponentResourse = currentComponentResourse;
    }
}
