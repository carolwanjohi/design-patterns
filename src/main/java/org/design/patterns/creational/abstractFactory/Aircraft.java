package org.design.patterns.creational.abstractFactory;

import org.design.patterns.creational.abstractFactory.enums.AircraftType;
import org.design.patterns.creational.abstractFactory.interfaces.IAircraftFactory;
import org.design.patterns.creational.abstractFactory.interfaces.ICockpit;
import org.design.patterns.creational.abstractFactory.interfaces.IEngine;
import org.design.patterns.creational.abstractFactory.interfaces.ITailWing;
import org.design.patterns.creational.abstractFactory.interfaces.IWings;

public class Aircraft {
    IEngine engine;
    IWings wings;
    ICockpit cockpit;
    IAircraftFactory factory;

    public Aircraft(IAircraftFactory factory) {
        this.factory = factory;
    }

    protected Aircraft makeAircraft() {
        engine = factory.createEngine();
        wings = factory.createWings();
        cockpit = factory.createCockpit();

        return this;
    }

    private void taxi() {
        System.out.println("Taxing on runway");
    }

    public void fly() {
        Aircraft aircraft = makeAircraft();

        cockpit.checkCockpit();
        engine.start();
        wings.checkWings();

        aircraft.taxi();

        System.out.println("Flying\n");
    }
}
