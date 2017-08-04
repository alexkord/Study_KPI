package ua.kpi.lesson_4.model.entity;

import java.util.ArrayList;
import java.util.List;

public class NoteModel {
    private List<Record> records;
    private Record record;

    public NoteModel() {
        this.records = new ArrayList<>();
    }

    public Record getRecord() {
        return record;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void addRecords(Record record) {
        this.records.add(record);
    }
}
