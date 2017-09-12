package ua.kpi.pen;

public class RightHand implements Hand {

    @Override
    public void draw(Paper paper) {
        paper.setText("Hello");
    }
}
