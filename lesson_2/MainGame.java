package lesson_2;
public class MainGame {
    public static void main(String[] args) {
       new GameController(new GameModel(), new GameView()).start();
    }
}
