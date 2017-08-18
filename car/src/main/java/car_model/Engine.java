package car_model;

import car_model.Component;

public class Engine extends Component {
    static final int periodOfFix = 10_000;
    private int lastFixedMileage = 20_000;

    public Engine(int currentComponentResourse) {
        super(currentComponentResourse);
    }

    public int getPeriodOfFix() {
        return periodOfFix;
    }

    public int getLastFixedMileage() {
        return lastFixedMileage;
    }

    public int getNextLimitResourse() {
        return currentComponentResourse + periodOfFix;
    }
}
