package org.design.patterns.creational.abstractFactory.factories;

import org.design.patterns.creational.abstractFactory.interfaces.ICockpit;
import org.design.patterns.creational.abstractFactory.interfaces.IEngine;
import org.design.patterns.creational.abstractFactory.interfaces.IHelicopterFactory;
import org.design.patterns.creational.abstractFactory.interfaces.ITailWing;
import org.design.patterns.creational.abstractFactory.planeParts.BellUH1HueyCockpit;
import org.design.patterns.creational.abstractFactory.planeParts.BellUH1HueyEngine;
import org.design.patterns.creational.abstractFactory.planeParts.BellUH1HueyTailWing;

public class BellUH1HueyFactory implements IHelicopterFactory {
    @Override
    public IEngine createEngine() {
        return new BellUH1HueyEngine();
    }

    @Override
    public ICockpit createCockpit() {
        return new BellUH1HueyCockpit();
    }


    @Override
    public ITailWing createTailWing() {
        return new BellUH1HueyTailWing();
    }
}
