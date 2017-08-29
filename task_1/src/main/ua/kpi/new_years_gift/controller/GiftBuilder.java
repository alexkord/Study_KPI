package main.ua.kpi.new_years_gift.controller;

import main.ua.kpi.new_years_gift.model.candy_model.IrisCandy;
import main.ua.kpi.new_years_gift.model.candy_model.Item;
import main.ua.kpi.new_years_gift.model.gift_model.Gift;
import main.ua.kpi.new_years_gift.model.candy_model.CaramelCandy;
import main.ua.kpi.new_years_gift.model.candy_model.ChocolateCandy;
import main.ua.kpi.new_years_gift.viewGift.GiftView;

import java.util.Scanner;

public class GiftBuilder {
    private static Scanner sc = new Scanner(System.in);

    public static Gift createGift() {
        Gift gift = new Gift();
        GiftView.show(GiftView.GREETINGS);
        GiftView.show(GiftView.COUNT_OF_CANDIES);
        int countOfType = sc.nextInt();
        for (int i = 0; i < countOfType; i++) {
            GiftView.show(GiftView.TYPE_OF_CANDIE);
            String candy = sc.next();
            GiftView.show(GiftView.COUNT_OF_ITEMS);
            int count = sc.nextInt();
            gift.addItem(checkCandy(candy), count);
        }
        return gift;
    }

    public static Gift ceateStandartGift() {
        Gift gift = new Gift();
        gift.addItem(new ChocolateCandy(), 7);
        return gift;
    }

    private static Item checkCandy(String candy) {
        if (candy.equalsIgnoreCase("caramel")) {
            return new CaramelCandy();
        } else if (candy.equalsIgnoreCase("chocolate")) {
            return new ChocolateCandy();
        } else if (candy.equalsIgnoreCase("iris")) {
            return new IrisCandy();
        } else {
            throw new RuntimeException("Not supported operation ");
        }
    }
}
