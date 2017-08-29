package main.ua.kpi.new_years_gift.controller;

import main.ua.kpi.new_years_gift.model.gift_model.Gift;
import org.junit.Test;

import static org.junit.Assert.*;

public class GiftBuilderTest {
    @Test
    public void ceateStandartGift() throws Exception {
        Gift gift = GiftBuilder.ceateStandartGift();
        assertNotNull(gift);
    }
}