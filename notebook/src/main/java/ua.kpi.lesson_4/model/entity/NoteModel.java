package ua.kpi.lesson_4.model.entity;

import java.util.ArrayList;
import java.util.List;

public class NoteModel {
    private List<Record> records;


    public NoteModel() {
        this.records = new ArrayList<>();
    }

    public List<Record> getRecords() {
        return records;
    }

    public void addRecords(Record record) {
        this.records.add(record);
    }

    @Override
    public String toString() {
        return "NoteModel{" +
                "records=" + records +
                '}';
    }
}
