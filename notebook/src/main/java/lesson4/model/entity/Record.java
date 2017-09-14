package lesson4.model.entity;

import java.time.LocalDate;
import java.util.Date;

public class Record {
    private Abonent abonent;
    private LocalDate dateOfCreate;
    private Date lastChangeDate;

    public Record(Abonent abonent) {
        this.abonent = abonent;
        this.dateOfCreate = LocalDate.now();
    }

    public Abonent getAbonent() {
        return abonent;
    }

    public LocalDate getDateOfCreate() {
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
        return abonent + ", dateOfCreate: " + dateOfCreate;
    }
}
