package org.design.patterns.creational.builder;

public class Boeing747Builder extends AircraftBuilder {
    Boeing747 boeing747;
    @Override
    public void buildEngine() {
        System.out.println("Boeing747Builder: build engine");
    }

    @Override
    public void buildCockpit() {
        System.out.println("Boeing747Builder: build cockpit");
    }

    @Override
    public void buildWings() {
        System.out.println("Boeing747Builder: build wings");
    }

    @Override
    public void buildBathrooms() {
        System.out.println("Boeing747Builder: build bathrooms");
    }
    public IAircraft getResult() {
        return boeing747;
    }
}
