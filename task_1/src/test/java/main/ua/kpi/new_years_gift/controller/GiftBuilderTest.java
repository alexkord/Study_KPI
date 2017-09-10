package main.ua.kpi.new_years_gift.controller;

import kpi.new_years_gift.controller.GiftBuilder;
import kpi.new_years_gift.model.gift_model.Gift;
import org.junit.Test;

import static org.junit.Assert.*;

public class GiftBuilderTest {
    @Test
    public void createStandartGift() throws Exception {
        Gift gift = GiftBuilder.buildGift();
        assertNotNull(gift);
    }
}