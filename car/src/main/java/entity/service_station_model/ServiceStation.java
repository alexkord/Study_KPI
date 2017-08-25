package entity.service_station_model;

import entity.car_model.Engine;

public class ServiceStation implements Fixable {


    @Override
    public boolean checkEngine(Engine engine) {
        if (engine.getCurrentComponentResourse() - engine.getLastFixedMileage() > engine.getPeriodOfFix()) {
            return true;
        }
        return false;
    }

    @Override
    public void fixEngine(Engine engine) {

    }
}
