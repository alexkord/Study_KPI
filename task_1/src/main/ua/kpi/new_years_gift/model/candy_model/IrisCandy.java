package main.ua.kpi.new_years_gift.model.candy_model;

public class IrisCandy implements Item {
    @Override
    public String name() {
        return "Iris candy";
    }

    @Override
    public double sugarContent() {
        return 2.4;
    }

    @Override
    public int weight() {
        return 15;
    }
}
