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
    }

    private void createRecord(Scanner sc) {

    }
}
