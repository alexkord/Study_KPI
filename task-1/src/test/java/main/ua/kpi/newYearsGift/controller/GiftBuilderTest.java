package test.java.main.ua.kpi.newYearsGift.controller;

import main.ua.kpi.newYearsGift.controller.GiftBuilder;
import main.ua.kpi.newYearsGift.model.giftModel.Gift;
import org.junit.Test;

import static org.junit.Assert.*;

public class GiftBuilderTest {
    @Test
    public void createStandartGift() throws Exception {
        Gift gift = GiftBuilder.buildGift();
        assertNotNull(gift);
    }
}