package main.ua.kpi.new_years_gift.util;

import main.ua.kpi.new_years_gift.model.candy_model.Item;
import main.ua.kpi.new_years_gift.model.gift_model.Gift;

import java.util.ArrayList;
import java.util.List;


public class FindBySugarRange {

    public List<Item> findSugarRange(Gift gift, int from, int to) {
        List<Item> items = new ArrayList<>();
        for (Item item : gift.getItems()) {
            if (item.sugarContent() >= from && item.sugarContent() <= to) {
                items.add(item);
            }
        }
        return items;
    }

    public List<String> showFound(List<Item> founded) {
        List<String> items = new ArrayList<>();
        for (Item item : founded) {
            items.add(item.toString());
        }
        return items;
    }
}
