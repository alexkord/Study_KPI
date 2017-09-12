package main.ua.kpi.newYearsGift;

import main.ua.kpi.newYearsGift.controller.GiftBuilder;
import main.ua.kpi.newYearsGift.model.giftModel.Gift;
import main.ua.kpi.newYearsGift.util.SortGiftByWeight;
import main.ua.kpi.newYearsGift.viewGift.GiftView;

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
