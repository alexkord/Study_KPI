package ua.kpi.pen;

public class Paper {

    private String text;

    public Paper(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "text='" + text + '\'' +
                '}';
    }
}
