package org.design.patterns.creational.abstractFactory.factories;

import org.design.patterns.creational.abstractFactory.interfaces.ICockpit;
import org.design.patterns.creational.abstractFactory.interfaces.IEngine;
import org.design.patterns.creational.abstractFactory.interfaces.IHelicopterFactory;
import org.design.patterns.creational.abstractFactory.interfaces.ITailWing;
import org.design.patterns.creational.abstractFactory.planeParts.BoeingVertol234Cockpit;
import org.design.patterns.creational.abstractFactory.planeParts.BoeingVertol234Engine;
import org.design.patterns.creational.abstractFactory.planeParts.BoeingVertol234TailWing;

public class BoeingVertol234Factory implements IHelicopterFactory {
    @Override
    public IEngine createEngine() {
        return new BoeingVertol234Engine();
    }

    @Override
    public ICockpit createCockpit() {
        return new BoeingVertol234Cockpit();
    }


    @Override
    public ITailWing createTailWing() {
        return new BoeingVertol234TailWing();
    }
}
