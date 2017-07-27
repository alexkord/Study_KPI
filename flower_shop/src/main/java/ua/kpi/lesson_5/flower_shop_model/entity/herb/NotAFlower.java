package ua.kpi.lesson_5.flower_shop_model.entity.herb;

public class NotAFlower extends Herb {
    private String name;

    public NotAFlower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
