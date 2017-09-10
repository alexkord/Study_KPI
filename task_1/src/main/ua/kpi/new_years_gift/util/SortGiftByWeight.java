package kpi.new_years_gift.util;

import kpi.new_years_gift.model.candy_model.Candy;

import java.util.Comparator;

public class SortGiftByWeight implements Comparator<Candy> {

    @Override
    public int compare(Candy c1, Candy c2) {
        return Integer.compare(c1.getWeight(), c2.getWeight());
    }
}
