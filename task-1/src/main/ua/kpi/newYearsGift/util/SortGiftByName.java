package main.ua.kpi.newYearsGift.util;

import main.ua.kpi.newYearsGift.model.candyModel.Candy;

import java.util.Comparator;

public class SortGiftByName implements Comparator<Candy> {

    @Override
    public int compare(Candy c1, Candy c2) {
        return c1.getCandyType().compareTo(c2.getCandyType());
    }
}
