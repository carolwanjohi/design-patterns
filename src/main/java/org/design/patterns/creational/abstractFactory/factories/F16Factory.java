package org.design.patterns.creational.abstractFactory.factories;

import org.design.patterns.creational.abstractFactory.enums.AircraftType;
import org.design.patterns.creational.abstractFactory.interfaces.ITailWing;
import org.design.patterns.creational.abstractFactory.planeParts.F16Cockpit;
import org.design.patterns.creational.abstractFactory.planeParts.F16Engine;
import org.design.patterns.creational.abstractFactory.planeParts.F16Wings;
import org.design.patterns.creational.abstractFactory.interfaces.IAircraftFactory;
import org.design.patterns.creational.abstractFactory.interfaces.ICockpit;
import org.design.patterns.creational.abstractFactory.interfaces.IEngine;
import org.design.patterns.creational.abstractFactory.interfaces.IWings;

public class F16Factory implements IAircraftFactory {
    @Override
    public IEngine createEngine() {
        return new F16Engine();
    }

    @Override
    public ICockpit createCockpit() {
        return new F16Cockpit();
    }

    @Override
    public IWings createWings() {
        return new F16Wings();
    }
}
