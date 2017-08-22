package main.ua.kpi.new_years_gift.controller;

import main.ua.kpi.new_years_gift.model.candy_model.IrisCandy;
import main.ua.kpi.new_years_gift.model.gift_model.Gift;
import main.ua.kpi.new_years_gift.model.candy_model.CaramelCandy;
import main.ua.kpi.new_years_gift.model.candy_model.ChocolateCandy;

public class GiftBuilder {

    public static Gift createGift() {
        Gift gift = new Gift();
        gift.addItem(new CaramelCandy(), 1);
        gift.addItem(new ChocolateCandy(), 1);
        gift.addItem(new IrisCandy(), 2);
        return gift;
    }
}
