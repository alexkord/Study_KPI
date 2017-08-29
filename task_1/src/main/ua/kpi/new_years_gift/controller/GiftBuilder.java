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
    private Gift gift;

    public void start() {
        gift = createGift();
    }

    public Gift createGift() {
        Gift gift = new Gift();
        int count = sc.nextInt();
        String candy = sc.next();
        for (int i = 0; i < count; i++) {
            GiftView.show(GiftView.TYPE_OF_CANDIE);
            GiftView.show(GiftView.COUNT_OF_CANDIES);
            gift.addItem(checkCandy(candy), count);
        }
        return gift;
    }

    private Item checkCandy(String candy) {
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
