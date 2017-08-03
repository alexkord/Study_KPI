package ua.kpi.lesson_4.controller;

import ua.kpi.lesson_4.model.entity.NoteModel;
import ua.kpi.lesson_4.view.ViewBook;

import java.util.Scanner;

public class NoteBookController {
    NoteModel noteModel;
    ViewBook viewBook;

    public NoteBookController(NoteModel noteModel, ViewBook viewBook) {
        this.noteModel = noteModel;
        this.viewBook = viewBook;
    }

    public void startRecord() {
        Scanner sc = new Scanner(System.in);
        createRecord(sc);
    }

    private void createRecord(Scanner sc) {
        ViewBook.print(ViewBook.ENTER_FIRSTNAME);
        String firstName = sc.next();
        ViewBook.print(ViewBook.ENTER_LASTNAME);
        String lastName = sc.next();
        ViewBook.print(ViewBook.ENTER_PATRONYMICNAME);
        String patronymicName = sc.next();
        ViewBook.print(ViewBook.ENTER_NICKNAME);
        ViewBook.print(ViewBook.ENTER_GROUP);
        ViewBook.print(ViewBook.ENTER_NICKNAME);
    }
}
