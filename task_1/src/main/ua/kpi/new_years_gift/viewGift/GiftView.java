package main.ua.kpi.new_years_gift.viewGift;

public class GiftView {
    public static final String GREETINGS = "Hello, let;s create a gift!";
    public static final String COUNT_OF_CANDIES = "Please, enter count of candies: ";
    public static final String TYPE_OF_CANDIE = "Type what kind of candie do you wish to add?:\n"
                                                + "1. Caramel candy\n" +
                                                    "2. Chocolate candy\n" +
                                                    "3. Iris candy";

    public static void show(String string) {
        System.out.print(string);
    }
}
