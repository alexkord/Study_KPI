package main.ua.kpi.new_years_gift;

import main.ua.kpi.new_years_gift.controller.GiftBuilder;
import main.ua.kpi.new_years_gift.model.gift_model.Gift;
import main.ua.kpi.new_years_gift.viewGift.GiftView;

public class MainNewYearsGift {
    public static void main(String[] args) {
        Gift gift = GiftBuilder.createGift();
        GiftView.showWeight(gift.getWeight());
    }
}
