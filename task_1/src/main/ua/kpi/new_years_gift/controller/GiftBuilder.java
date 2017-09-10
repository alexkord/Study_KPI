package kpi.new_years_gift.controller;

import kpi.new_years_gift.model.candy_model.*;
import kpi.new_years_gift.model.gift_model.Gift;
import kpi.new_years_gift.viewGift.GiftView;

import java.util.Scanner;

public class GiftBuilder {
    private static Scanner sc = new Scanner(System.in);
    private static final int COUNT_OF_CANDIES = 7;

    public static Gift buildGift() {
        Gift gift = new Gift();
        gift.addCandy(new Candy.CandyBuilder(CandyType.CARAMEL)
                .setSugarContent(2.2)
                .setWeight(14)
                .build());
        return gift;
    }

    private static CandyType checkCandy(String candy) {
        if (candy.equalsIgnoreCase("caramel")) {
            return CandyType.CARAMEL;
        } else if (candy.equalsIgnoreCase("chocolate")) {
            return CandyType.CHOCOLATE;
        } else if (candy.equalsIgnoreCase("iris")) {
            return CandyType.IRIS;
        } else {
            throw new RuntimeException("Not supported operation ");
        }
    }
}
