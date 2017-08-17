package ua.kpi.new_years_gift;

public class GiftBuilder {

    public static Gift createGift() {
        Gift gift = new Gift();
        gift.addItem(new CaramelCandy(), 3);
        gift.addItem(new ChocolateCandy(), 5);
        return gift;
    }
}
