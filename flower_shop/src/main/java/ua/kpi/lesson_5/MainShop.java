package ua.kpi.lesson_5;

import ua.kpi.lesson_5.flower_shop_controller.ShopController;
import ua.kpi.lesson_5.flower_shop_model.ShopModel;
import ua.kpi.lesson_5.view_shop.ViewFlowerShop;

public class MainShop {
    public static void main(String[] args) {
        new ShopController(new ShopModel(), new ViewFlowerShop()).start();
    }
}
