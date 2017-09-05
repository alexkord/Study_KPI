package kpi.new_years_gift.util;

import kpi.new_years_gift.model.candy_model.Item;

import java.util.Comparator;

public class SortGiftByWeight implements Comparator<Item> {

    @Override
    public int compare(Item c1, Item c2) {
        return Integer.compare(c1.weight(), c2.weight());
    }
}
