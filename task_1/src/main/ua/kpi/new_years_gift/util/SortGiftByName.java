package main.ua.kpi.new_years_gift.util;

import main.ua.kpi.new_years_gift.model.candy_model.Item;

import java.util.Comparator;

public class SortGiftByName implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.name().compareTo(o2.name());
    }
}
