package service_station_model;

import car_model.Engine;

public interface Fixable {
    boolean checkEngine(Engine engine);
    void fixEngine(Engine engine);
}
