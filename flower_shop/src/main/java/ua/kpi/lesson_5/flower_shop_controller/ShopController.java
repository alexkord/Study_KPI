package ua.kpi.lesson_5.flower_shop_controller;

import ua.kpi.lesson_5.flower_shop_model.ShopModel;
import ua.kpi.lesson_5.flower_shop_model.entity.bouquet.Bouquet;
import ua.kpi.lesson_5.flower_shop_model.entity.herb.*;
import ua.kpi.lesson_5.view_shop.ViewFlowerShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopController {
    private ShopModel shopModel;
    private ViewFlowerShop viewFlowerShop;

    public ShopController(ShopModel shopModel, ViewFlowerShop viewFlowerShop) {
        this.shopModel = shopModel;
        this.viewFlowerShop = viewFlowerShop;
    }

    public void start() {
        shopModel.setBouquet(createBouquet());
    }

    public Bouquet createBouquet() {
        Bouquet bouquet = new Bouquet(getHerbs());
        return bouquet;
    }

    public List<Herb> getHerbs() {
        viewFlowerShop.print(ViewFlowerShop.MESSAGE);
        Scanner scanner = new Scanner(System.in);
        List<Herb> herbs = new ArrayList<>();
        for (int i = 0; i < herbs.size(); i++) {
            herbs.add(getHerbFactory(scanner));
        }
        return herbs;
    }

    private Herb getHerbFactory(Scanner scanner) {
        viewFlowerShop.print(viewFlowerShop.TYPE_OF_HERB);
        String herbType = scanner.next();
        viewFlowerShop.print(viewFlowerShop.NAME_OF_HERB);
        String herbName = scanner.next();
        if (herbType.equalsIgnoreCase("Branch")) {
            return new Branch(herbName);
        } else if (herbType.equalsIgnoreCase("Flower")) {
            return new Flower(herbName);
        } else if (herbType.equalsIgnoreCase("Multiply Blossom")) {
            return new MultiplyBlossomFlower(herbName);
        } else if (herbType.equalsIgnoreCase("Not a flower")) {
            return new NotAFlower(herbName);
        } else if (herbType.equalsIgnoreCase("Shrub")) {
            return new Shrub(herbName);
        } else if (herbType.equalsIgnoreCase("Single Blossom")) {

        }
        return null;
    }

}
