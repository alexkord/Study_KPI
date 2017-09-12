package main.ua.kpi.newYearsGift.util;

import main.ua.kpi.newYearsGift.model.candyModel.Candy;
import main.ua.kpi.newYearsGift.model.giftModel.Gift;

import java.util.ArrayList;
import java.util.List;

public class FindBySugarRange {

    public List<Candy> findBySugar(Gift gift, int from, int to) {
        List<Candy> candies = new ArrayList<>();
        for (Candy candy : gift.getCandies()) {
            if (candy.getSugarContent() >= from && candy.getSugarContent() <= to) {
                candies.add(candy);
            }
        }
        return candies;
    }
}
