package lesson4;


import lesson4.controller.NoteBookController;
import lesson4.model.entity.NoteModel;
import lesson4.view.ViewBook;

public class MainBook {
    public static void main(String[] args) {
        new NoteBookController(new NoteModel(), new ViewBook()).startRecord();
    }
}
