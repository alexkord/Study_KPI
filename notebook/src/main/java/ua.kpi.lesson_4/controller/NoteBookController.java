package ua.kpi.lesson_4.controller;

import ua.kpi.lesson_4.model.entity.Abonent;
import ua.kpi.lesson_4.model.entity.NoteModel;
import ua.kpi.lesson_4.model.entity.Record;
import ua.kpi.lesson_4.view.RegEx;
import ua.kpi.lesson_4.view.ViewBook;

import java.util.Scanner;

public class NoteBookController {
    private NoteModel noteModel;
    private ViewBook viewBook;
    private Abonent abonent;
    private Record record;

    public NoteBookController(NoteModel noteModel, ViewBook viewBook) {
        this.noteModel = noteModel;
        this.viewBook = viewBook;
    }

    public void startRecord() {
        createRecord();
    }

    private void createRecord() {
        Scanner sc = new Scanner(System.in);
        String firstName = checkInput(sc, ViewBook.ENTER_FIRSTNAME, RegEx.FIRST_NAME);
        String lastName = checkInput(sc, ViewBook.ENTER_LASTNAME, RegEx.LAST_NAME);
        abonent = new Abonent(firstName, lastName);
        record = new Record(abonent);
        noteModel.addRecords(record);
        ViewBook.printObject(record);
    }

    private String checkInput(Scanner sc, String message, String regex) {
        String result;
        ViewBook.print(message);
        while (!(sc.hasNext() && (result = sc.next()).matches(regex))) {
            ViewBook.print(ViewBook.INCORRECT_INPUT);
        }
        return result;
    }
}
