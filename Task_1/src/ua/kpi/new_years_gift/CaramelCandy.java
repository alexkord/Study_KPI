package ua.kpi.new_years_gift;

public class CaramelCandy extends Candy {
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
