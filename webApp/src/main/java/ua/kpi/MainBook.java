package ua.kpi;

import ua.kpi.controller.NoteBookController;
import ua.kpi.model.entity.NoteModel;
import ua.kpi.view.ViewBook;

public class MainBook {
    public static void main(String[] args) {
        new NoteBookController(new NoteModel(), new ViewBook()).startRecord();
    }
}
