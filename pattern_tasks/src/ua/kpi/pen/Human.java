package ua.kpi.pen;

public class Human {
    private String name;
    private Hand hand;
    private State state;

    public void setState(State state) {
        this.state = state;
    }
}
