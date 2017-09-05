package kpi.new_years_gift.model.candy_model;

import kpi.new_years_gift.model.candy_model.Item;

public class CaramelCandy implements Item {
    @Override
    public String name() {
        return "Caramel candy";
    }

    @Override
    public double sugarContent() {
        return 2.8;
    }

    @Override
    public int weight() {
        return 16;
    }
}
