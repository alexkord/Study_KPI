package ua.kpi.lesson_5.flower_shop_model.entity.bouquet;

import ua.kpi.lesson_5.flower_shop_model.entity.accessories.*;
import ua.kpi.lesson_5.flower_shop_model.entity.herb.Flower;
import ua.kpi.lesson_5.flower_shop_model.entity.herb.Herb;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Herb> flowers;
    private Accessory accessory;
    private Cost cost;
    private Event event;
    private Freshness freshness;
    private Stem stem;
    private Volume volume;

    public Bouquet(List<Herb> flowers) {
        this.flowers = flowers;
        setAccessory(Accessory.BASIS);
        setCost(Cost.CHEAP);
        setEvent(Event.ALL);
        setFreshness(Freshness.FRESHEST);
        setStem(Stem.SHORT_STEM);
        setVolume(Volume.LARGE);
    }

    public Bouquet(List<Herb> flowers, Accessory accessory, Cost cost, Event event, Freshness freshness, Stem stem, Volume volume) {
        this.flowers = flowers;
        this.accessory = accessory;
        this.cost = cost;
        this.event = event;
        this.freshness = freshness;
        this.stem = stem;
        this.volume = volume;
    }

    public void setAccessory(Accessory accessory) {
        this.accessory = accessory;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    public void setStem(Stem stem) {
        this.stem = stem;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers = " + flowers +
                ", accessory = " + accessory +
                ", cost = " + cost +
                ", event = " + event +
                ", freshness = " + freshness +
                ", stem = " + stem +
                ", volume = " + volume +
                '}';
    }
}
