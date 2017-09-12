package main.ua.kpi.newYearsGift.controller;

import main.ua.kpi.newYearsGift.model.candyModel.Candy;
import main.ua.kpi.newYearsGift.model.candyModel.CandyType;
import main.ua.kpi.newYearsGift.model.giftModel.Gift;

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
