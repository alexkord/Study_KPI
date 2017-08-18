import car_model.Engine;

public class MainCar {
    public static void main(String[] args) {
        Engine engine = new Engine(35_000);
        System.out.println(engine.getNextLimitResourse());
    }
}
