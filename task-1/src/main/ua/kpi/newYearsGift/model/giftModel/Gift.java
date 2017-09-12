package main.ua.kpi.newYearsGift.model.giftModel;

import main.ua.kpi.newYearsGift.model.candyModel.Candy;

import java.util.ArrayList;
import java.util.List;

public class Gift {
    private List<Candy> candies = new ArrayList<>();

    public void addCandy(Candy candy) {
        candies.add(candy);
    }

    public double getSugarContent() {
        double content = 0.0;
        for (Candy candy : candies) {
            content += candy.getSugarContent();
        }
        return content;
    }

    public int getWeight() {
        int weight = 0;
        for (Candy candy : candies) {
            weight += candy.getWeight();
        }
        return weight;
    }

    public List<Candy> getCandies() {
        return candies;
    }

    public void showItems() {
        for (Candy candy : candies) {
            System.out.println("Item: " + candy.getCandyType());
            System.out.println("Sugar content: " + candy.getSugarContent());
            System.out.println("Weight: " + candy.getSugarContent());
        }
    }
}


