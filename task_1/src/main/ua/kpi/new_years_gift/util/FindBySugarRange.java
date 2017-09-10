package kpi.new_years_gift.util;

import kpi.new_years_gift.model.candy_model.Candy;
import kpi.new_years_gift.model.gift_model.Gift;

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
