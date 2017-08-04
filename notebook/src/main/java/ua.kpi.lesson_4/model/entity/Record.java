package ua.kpi.lesson_4.model.entity;

import java.util.Date;

public class Record {
    private Abonent abonent;
    private Date dateOfCreate;
    private Date lastChangeDate;

    public Record(Abonent abonent, Date dateOfCreate, Date lastChangeDate) {
        this.abonent = abonent;
        this.dateOfCreate = dateOfCreate;
        this.lastChangeDate = lastChangeDate;
    }
}
