package ua.kpi.lesson_5.flower_shop_controller;

import ua.kpi.lesson_5.flower_shop_model.ShopModel;
import ua.kpi.lesson_5.flower_shop_model.entity.bouquet.Bouquet;
import ua.kpi.lesson_5.flower_shop_model.entity.herb.Branch;
import ua.kpi.lesson_5.flower_shop_model.entity.herb.Flower;
import ua.kpi.lesson_5.flower_shop_model.entity.herb.Herb;
import ua.kpi.lesson_5.flower_shop_model.entity.herb.NotAFlower;
import ua.kpi.lesson_5.view_shop.ViewFlowerShop;

import java.util.ArrayList;
import java.util.List;

public class ShopController {
    private ShopModel shopModel;
    private ViewFlowerShop viewFlowerShop;

    public ShopController(ShopModel shopModel, ViewFlowerShop viewFlowerShop) {
        this.shopModel = shopModel;
        this.viewFlowerShop = viewFlowerShop;
    }

    public void start() {
        createBouquet();
    }

    public Bouquet createBouquet() {
        Bouquet bouquet = new Bouquet(getHerbs());
        return bouquet;
    }

    public List<Herb> getHerbs() {
        viewFlowerShop.print(ViewFlowerShop.MESSAGE);
        List<Herb> herbs = new ArrayList<>();
        Branch b = new Branch("Branch");
        Flower f = new Flower("Rose");
        NotAFlower naf = new NotAFlower("Not a flower");
        herbs.add(b);
        herbs.add(f);
        herbs.add(naf);
        return herbs;
    }

}
