package ua.kpi.new_years_gift;

public class NewYearsGigt {
    public static void main(String[] args) {
        Gift newYearsGift = GiftBuilder.createGift();
        newYearsGift.showItems();
        System.out.println("Total sugar content: " + newYearsGift.getSugarContent());
        System.out.println("Total weight: " + newYearsGift.getWeight());
    }
}
