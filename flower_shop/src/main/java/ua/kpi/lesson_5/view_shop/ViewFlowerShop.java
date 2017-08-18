package ua.kpi.lesson_5.view_shop;

public class ViewFlowerShop {

    public static final String BRANCH = "What would u like to create: ";
    public static final String FLOWER = "What would u like to create: ";
    public static final String MULTIPLY_BLOSSOM = "What would u like to create: ";
    public static final String MESSAGE = "What would u like to create: ";
    //input
    public static final String FIRST_MESSAGE = "What would u like to create? ";
    public static void print(String... messages) {
        for (String message: messages) {
            System.out.println(message);
        }
    }
}
