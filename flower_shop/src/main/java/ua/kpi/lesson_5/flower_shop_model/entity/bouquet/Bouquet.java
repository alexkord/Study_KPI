package ua.kpi.lesson_5.flower_shop_model.entity.bouquet;

import ua.kpi.lesson_5.flower_shop_model.entity.accessories.*;
import ua.kpi.lesson_5.flower_shop_model.entity.herb.Flower;
import ua.kpi.lesson_5.flower_shop_model.entity.herb.Herb;
import ua.kpi.lesson_5.flower_shop_model.entity.herb.NotAFlower;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<? extends Herb> flowers;
    private Accessory accessory;
    private Cost cost;
    private Event event;
    private Freshness freshness;
    private Stem stem;
    private Volume volume;

    public Bouquet(List<? extends Herb> flowers) {
        this.flowers = flowers;
    }

    public Bouquet(List<? extends Herb> flowers, Accessory accessory, Cost cost, Event event, Freshness freshness, Stem stem, Volume volume) {
        this.flowers = flowers;
        this.accessory = accessory;
        this.cost = cost;
        this.event = event;
        this.freshness = freshness;
        this.stem = stem;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                ", accessory=" + accessory +
                ", cost=" + cost +
                ", event=" + event +
                ", freshness=" + freshness +
                ", stem=" + stem +
                ", volume=" + volume +
                '}';
    }
}
