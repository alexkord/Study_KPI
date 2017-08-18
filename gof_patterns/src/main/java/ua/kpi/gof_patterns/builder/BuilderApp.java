package ua.kpi.gof_patterns.builder;

public class BuilderApp {

    public static void main(String[] args) {
        Car car1 = new CarBuilder2()
                .buildMake("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buidMaxSpeed(280)
                .build();
        System.out.println(car1);
        //--------------------------------------
        Director director = new Director();
        director.setBuilder(new FordMondeoBuilder());
        Car car2 = director.buildCar();
        System.out.println(car2);
    }
}

enum Transmission {
    MANUAL, AUTO
}

class Car {
    String make;
    Transmission transmission;
    int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car [make " + make + ", transmission = " + transmission +
                ", max speed = " + maxSpeed;
    }
}

abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }
}

class FordMondeoBuilder extends CarBuilder {

    @Override
    void buildMake() {
        car.setMake("Ford Mondeo");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}

class SubaruImprezaBuilder extends CarBuilder {

    @Override
    void buildMake() {
        car.setMake("Subaru Impreza");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }
}

class Director {
    CarBuilder builder;

    void setBuilder(CarBuilder b) {
        this.builder = b;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();
        return car;
    }
}

class CarBuilder2 {
    String m = "Default";
    Transmission t = Transmission.MANUAL;
    int s = 120;

    CarBuilder2 buildMake(String m) {
        this.m = m;
        return this;
    }

    CarBuilder2 buildTransmission(Transmission t) {
        this.t = t;
        return this;
    }

    CarBuilder2 buidMaxSpeed(int s) {
        this.s = s;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setMake(m);
        car.setTransmission(t);
        car.setMaxSpeed(s);
        return car;
    }
}