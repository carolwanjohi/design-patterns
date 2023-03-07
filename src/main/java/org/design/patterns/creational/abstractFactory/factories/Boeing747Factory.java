package org.design.patterns.creational.abstractFactory.factories;

import org.design.patterns.creational.abstractFactory.enums.AircraftType;
import org.design.patterns.creational.abstractFactory.interfaces.ITailWing;
import org.design.patterns.creational.abstractFactory.planeParts.Boeing747Cockpit;
import org.design.patterns.creational.abstractFactory.planeParts.Boeing747Engine;
import org.design.patterns.creational.abstractFactory.planeParts.Boeing747Wings;
import org.design.patterns.creational.abstractFactory.interfaces.IAircraftFactory;
import org.design.patterns.creational.abstractFactory.interfaces.ICockpit;
import org.design.patterns.creational.abstractFactory.interfaces.IEngine;
import org.design.patterns.creational.abstractFactory.interfaces.IWings;

public class Boeing747Factory implements IAircraftFactory {
    @Override
    public IEngine createEngine() {
        return new Boeing747Engine();
    }

    @Override
    public ICockpit createCockpit() {
        return new Boeing747Cockpit();
    }

    @Override
    public IWings createWings() {
        return new Boeing747Wings();
    }
}
