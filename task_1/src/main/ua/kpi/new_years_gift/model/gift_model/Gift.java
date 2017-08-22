package main.ua.kpi.new_years_gift.model.gift_model;

import main.ua.kpi.new_years_gift.model.candy_model.Item;

import java.util.ArrayList;
import java.util.List;

public class Gift {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item, int count) {
        for (int i = 0; i < count; i++) {
            items.add(item);
        }
    }

    public double getSugarContent() {
        double content = 0.0;
        for (Item item : items) {
            content += item.sugarContent();
        }
        return content;
    }

    public int getWeight() {
        int weight = 0;
        for (Item item : items) {
            weight += item.weight();
        }
        return weight;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.name());
            System.out.println("Sugar content: " + item.sugarContent());
            System.out.println("Weight: " + item.weight());
        }
    }
}


