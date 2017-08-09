package ua.kpi.model.entity;

import org.junit.Assert;
import org.junit.Test;
import ua.kpi.model.entity.Abonent;

import static org.junit.Assert.*;

public class AbonentTest {
    @Test
    public void createAbonent() throws Exception {
        Abonent abonent1 = Abonent.createAbonent("Alex", "Kord");
        Abonent abonent2 = abonent1;
        assertEquals(abonent2, abonent1);
    }

}