package ua.kpi.guessGame;

import java.util.Locale;
import java.util.ResourceBundle;

public class GameView {
    //Resourse bundle
    public static final String BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME, new Locale("en", "EN"));
    //Game
    static final String START_GAME = "input";
    static final String GUESS = "Congrats!!! You guess)";
    static final String MORE = "The secret number is more than yours";
    static final String LESS = "The secret number is less than yours";

    //Input
    static final String ENTER_FIRST_RANGE = "Enter the first range number : ";
    static final String ENTER_LAST_RANGE = "Enter the last range number: ";
    static final String ENTER_GUESS = "Enter the guess number: ";

    public static void print(String...messages) {
        for (String s : messages) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void print(int...messages) {
        for (int i : messages) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static String printGreeting() {
        return bundle.getString(START_GAME);
    }

    public static void printRange(int start, int end) {
        System.out.printf("Guess number from %d to %d\n", start, end);
    }

}
