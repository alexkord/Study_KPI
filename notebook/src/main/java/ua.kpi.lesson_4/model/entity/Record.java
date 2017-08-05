package ua.kpi.lesson_4.model.entity;

import java.time.LocalDateTime;
import java.util.Date;

public class Record {
    private Abonent abonent;
    private LocalDateTime dateOfCreate;
    private Date lastChangeDate;

    public Record(Abonent abonent) {
        this.abonent = abonent;
        this.dateOfCreate = LocalDateTime.now();
    }

    public Abonent getAbonent() {
        return abonent;
    }

    public LocalDateTime getDateOfCreate() {
        return dateOfCreate;
    }

    public Date getLastChangeDate() {
        return lastChangeDate;
    }

    public void createRecord(Abonent abonent) {
        Record record = new Record(abonent);
    }

    @Override
    public String toString() {
        return "Record{" +
                "abonent=" + abonent +
                ", dateOfCreate=" + dateOfCreate +
                '}';
    }
}
