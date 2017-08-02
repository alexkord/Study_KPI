package ua.kpi.lesson_5.view_shop;

public class ViewFlowerShop {
    public static final String TYPE_OF_HERB = "Enter type of herb that u want to add: ";
    public static final String NAME_OF_HERB = "Enter name of herb:  ";

    public static void print(String... messages) {
        for (String message: messages) {
            System.out.print(message);
        }
    }
}
