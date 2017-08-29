package main.ua.kpi.new_years_gift.viewGift;

public class GiftView {
    public static final String GREETINGS = "Hello, let;s create a gift!\n";
    public static final String COUNT_OF_ITEMS = "Enter count of items: ";
    public static final String COUNT_OF_CANDIES = "Please, enter count of candies: ";
    public static final String TYPE_OF_CANDIE = "Type what kind of candie do you wish to add?:\n"
                                                + "Caramel candy\n" +
                                                    "Chocolate candy\n" +
                                                    "Iris candy\n";

    public static void show(String string) {
        System.out.print(string);
    }

    public static void showWeight(int i) {
        System.out.println(i + "g");
    }
}
