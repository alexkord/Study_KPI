package ua.kpi.new_years_gift;

public class GiftBuilder {

    public static Gift createGift() {
        Gift gift = new Gift();
        gift.addItem(new CaramelCandy(), 1);
        gift.addItem(new ChocolateCandy(), 1);
        gift.addItem(new IrisCandy(), 2);
        return gift;
    }
}
