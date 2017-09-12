package main.ua.kpi.newYearsGift.util;


import main.ua.kpi.newYearsGift.model.candyModel.Candy;

import java.util.Comparator;

public class SortGiftByWeight implements Comparator<Candy> {

    @Override
    public int compare(Candy c1, Candy c2) {
        return Integer.compare(c1.getWeight(), c2.getWeight());
    }
}
