package org.design.patterns.creational.builder;

public abstract class AircraftBuilder {
    public void buildEngine() {
        System.out.println("AircraftBuilder: build engine");
    }

    public void buildCockpit() {
        System.out.println("AircraftBuilder: build cockpit");
    }

    public void buildWings() {
        System.out.println("AircraftBuilder: build wings");
    }

    public void buildBathrooms() {
        System.out.println("AircraftBuilder: build bathrooms");
    }

    abstract public IAircraft getResult();
}
