package ua.kpi.pen;

public class LeftHand implements Hand {

    @Override
    public void draw(Paper paper) {
        paper.setText("Hello");
    }
}
