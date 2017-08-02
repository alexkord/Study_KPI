package ua.kpi.lesson_5.flower_shop_model;
import ua.kpi.lesson_5.flower_shop_model.entity.bouquet.Bouquet;

public class ShopModel {
    public static final int COUNT_OF_HERBS = 10;
    private Bouquet bouquet;

    public Bouquet getBouquet() {
        return bouquet;
    }

    public void setBouquet(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public String toString() {
        return "ShopModel{" +
                "bouquet=" + bouquet +
                '}';
    }
}
