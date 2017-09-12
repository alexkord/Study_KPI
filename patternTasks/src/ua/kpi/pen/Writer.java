package ua.kpi.pen;

public class Writer implements State {

    @Override
    public void becomeSpec(Human human) {
        human.setState(this);
    }
}
