package car_model;

public class Chassis extends Component {
    static final int periodOfFix = 5_000;
    private int lastFixedMileage = 10_000;

    public Chassis(int currentComponentResourse) {
        super(currentComponentResourse);
    }
}
