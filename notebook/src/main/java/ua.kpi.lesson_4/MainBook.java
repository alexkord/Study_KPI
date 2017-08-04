package ua.kpi.lesson_4;


import ua.kpi.lesson_4.controller.NoteBookController;
import ua.kpi.lesson_4.model.entity.NoteModel;
import ua.kpi.lesson_4.view.ViewBook;

public class MainBook {
    public static void main(String[] args) {
        new NoteBookController(new NoteModel(), new ViewBook()).startRecord();
    }
}
