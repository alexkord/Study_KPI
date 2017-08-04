package ua.kpi.lesson_4.model.entity;

import java.time.LocalDateTime;
import java.util.Date;

public class Record {
    private Abonent abonent;
    private LocalDateTime dateOfCreate;
    private Date lastChangeDate;

    public Record(Abonent abonent, Date dateOfCreate, Date lastChangeDate) {
        this.abonent = abonent;
        this.dateOfCreate = LocalDateTime.now();
        this.lastChangeDate = lastChangeDate;
    }
}
