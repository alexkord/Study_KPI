import car_model.Engine;

public class MainTest {
    public static void main(String[] args) {
        Engine engine = new Engine(35_000);
        System.out.println(engine.getNextLimitResourse());
    }
}
