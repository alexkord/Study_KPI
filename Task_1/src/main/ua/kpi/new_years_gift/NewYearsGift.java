package main.ua.kpi.new_years_gift;

import main.ua.kpi.new_years_gift.gift_model.Gift;

public class NewYearsGift {
    public static void main(String[] args) {
        Gift newYearsGift = GiftBuilder.createGift();
        newYearsGift.showItems();
        System.out.println("Total sugar content: " + newYearsGift.getSugarContent());
        System.out.println("Total weight: " + newYearsGift.getWeight());
    }
}
