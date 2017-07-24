package lesson_2;
class GameModel {
    private int secretRand;
    final static int RAND_MIN = 0;
    final static int RAND_MAX = 100;
    private int guessNumber;

    private int rand(int min, int max) {
        secretRand = (int)(min + Math.random() * max);
        return secretRand;
    }

    private int rand() {
        return secretRand = (int)(Math.random() * RAND_MAX);
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    public int getSecretRand() {
        return secretRand;
    }

    public void setGuessNumber(int number) {
        this.guessNumber = number;
    }

    public void setGame(int min, int max) {
        secretRand = rand(min, max);
    }

    public void setGame() {
        secretRand = rand();
    }
}
