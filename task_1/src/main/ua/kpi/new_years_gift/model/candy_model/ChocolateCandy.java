package kpi.new_years_gift.model.candy_model;

import kpi.new_years_gift.model.candy_model.Item;

public class ChocolateCandy implements Item {
    @Override
    public String name() {
        return "Chocolate candy";
    }

    @Override
    public double sugarContent() {
        return 3.5;
    }

    @Override
    public int weight() {
        return 17;
    }
}
