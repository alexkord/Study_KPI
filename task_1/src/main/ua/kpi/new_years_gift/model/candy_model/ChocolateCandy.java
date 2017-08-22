package main.ua.kpi.new_years_gift.model.candy_model;

public class ChocolateCandy extends Candy {
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
