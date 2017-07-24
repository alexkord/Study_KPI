package com.course.study.lesson_2;

public class MainGame {
    public static void main(String[] args) {
        GameModel gm = new GameModel();
        GameView gv = new GameView();
        GameController gc = new GameController(gm, gv);
        gc.start();
    }
}
