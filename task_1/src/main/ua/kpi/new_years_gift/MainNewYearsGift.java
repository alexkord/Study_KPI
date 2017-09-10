package kpi.new_years_gift;

import kpi.new_years_gift.controller.GiftBuilder;
import kpi.new_years_gift.model.gift_model.Gift;
import kpi.new_years_gift.util.SortGiftByWeight;
import kpi.new_years_gift.viewGift.GiftView;

import java.util.Collections;

public class MainNewYearsGift {
    public static void main(String[] args) {
        Gift gift = GiftBuilder.buildGift();
        GiftView.showWeight(gift.getWeight());
        Collections.sort(gift.getCandies(), new SortGiftByWeight());
        gift.showItems();
        Gift gift1 = GiftBuilder.buildGift();
    }
}
