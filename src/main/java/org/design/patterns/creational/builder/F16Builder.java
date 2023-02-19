package org.design.patterns.creational.builder;

public class F16Builder extends AircraftBuilder {
    F16 f16;

    @Override
    public void buildEngine() {
        System.out.println("F16Builder: build engine");
    }

    @Override
    public void buildWings() {
        System.out.println("F16Builder: build wings");
    }

    @Override
    public void buildCockpit() {
        System.out.println("F16Builder: cockpit");
    }

    public IAircraft getResult() {
        return f16;
    }
}
