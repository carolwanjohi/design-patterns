package org.design.patterns.creational.abstractFactory;

import org.design.patterns.creational.abstractFactory.interfaces.ICockpit;
import org.design.patterns.creational.abstractFactory.interfaces.IEngine;
import org.design.patterns.creational.abstractFactory.interfaces.IHelicopterFactory;
import org.design.patterns.creational.abstractFactory.interfaces.ITailWing;

public class Helicopter {
    IEngine engine;
    ICockpit cockpit;
    ITailWing tailWing;
    IHelicopterFactory factory;

    public Helicopter(
            IHelicopterFactory factory
    ) {
        this.factory = factory;
    }

    protected Helicopter makeHelicopter() {
        engine = factory.createEngine();
        tailWing = factory.createTailWing();
        cockpit = factory.createCockpit();

        return this;
    }


    public void verticalTakeOff() {
        Helicopter helicopter = makeHelicopter();

        cockpit.checkCockpit();
        engine.start();
        tailWing.checkTailWing();

        System.out.println("Take off\n");
    }
}
