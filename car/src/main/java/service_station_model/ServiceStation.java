package service_station_model;

import car_model.Engine;

public class ServiceStation implements Fixable {


    @Override
    public boolean checkEngine(Engine engine) {
        if (engine.getComponentResourse() > engine.getNextLimitResourse()) {

        }
        return true;
    }

    @Override
    public void fixEngine(Engine engine) {

    }
}
