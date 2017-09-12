package ua.kpi.guessGame;

import java.util.Scanner;

class GameController {
    private GameModel gameModel;
    private GameView gameView;

    GameController(GameModel gm, GameView gv) {
        this.gameModel = gm;
        this.gameView = gv;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        setupGame(sc);
        guessGame(sc);
    }

    public void setupGame(Scanner sc) {
        gameView.print(GameView.printGreeting(), GameView.ENTER_FIRST_RANGE);
        int start = sc.nextInt();
        gameView.print(GameView.ENTER_LAST_RANGE);
        int end = sc.nextInt();
        gameView.printRange(start, end);
        gameModel.setGame(start, end);
    }


    private void guessGame(Scanner sc) {
        int guess = -1;
        int secretRand = gameModel.getSecretRand();
        while (guess != secretRand) {
            GameView.print(GameView.ENTER_GUESS);
            guess = sc.nextInt();
            checkGuess(guess, secretRand);
        }
    }

    private void checkGuess(int guess, int secretRand) {
        if (guess == secretRand) {
            GameView.print(GameView.GUESS);
        } else if (guess > secretRand) {
            GameView.print(GameView.LESS);
        } else {
            GameView.print(GameView.MORE);
        }
    }
}
