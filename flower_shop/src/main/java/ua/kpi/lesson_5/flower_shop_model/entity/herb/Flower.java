package ua.kpi.lesson_5.flower_shop_model.entity.herb;

public class Flower extends Herb {
    private String name;

    public Flower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}