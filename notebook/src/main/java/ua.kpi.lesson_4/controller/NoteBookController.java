package ua.kpi.lesson_4.controller;

import ua.kpi.lesson_4.model.entity.NoteModel;
import ua.kpi.lesson_4.view.RegEx;
import ua.kpi.lesson_4.view.ViewBook;

import java.util.Scanner;

public class NoteBookController {
    private NoteModel noteModel;
    private ViewBook viewBook;

    public NoteBookController(NoteModel noteModel, ViewBook viewBook) {
        this.noteModel = noteModel;
        this.viewBook = viewBook;
    }

    public void startRecord() {
        Scanner sc = new Scanner(System.in);
        createRecord(sc);
    }

    private void createRecord(Scanner sc) {
        checkInput(sc, ViewBook.ENTER_FIRSTNAME, RegEx.FIRST_NAME);


    }

    private String checkInput(Scanner sc, String message, String regex) {
        return "";
    }
}
