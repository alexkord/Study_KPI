package ua.kpi.lesson_5.flower_shop_controller;

import ua.kpi.lesson_5.flower_shop_model.ShopModel;
import ua.kpi.lesson_5.flower_shop_model.entity.bouquet.Bouquet;
import ua.kpi.lesson_5.view_shop.ViewFlowerShop;

public class ShopController {
    private ShopModel shopModel;
    private ViewFlowerShop viewFlowerShop;

    public ShopController(ShopModel shopModel, ViewFlowerShop viewFlowerShop) {
        this.shopModel = shopModel;
        this.viewFlowerShop = viewFlowerShop;
    }

    public void start() {}
}
