package ua.kpi.new_years_gift;

import org.junit.Test;

import static org.junit.Assert.*;

public class GiftBuilderTest {
    @Test
    public void createGift() throws Exception {
        Gift gift = GiftBuilder.createGift();
        assertNotNull(gift);
    }

}