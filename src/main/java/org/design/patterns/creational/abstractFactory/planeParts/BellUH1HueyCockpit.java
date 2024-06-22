package org.design.patterns.creational.abstractFactory.planeParts;


import org.design.patterns.creational.abstractFactory.interfaces.ICockpit;

public class BellUH1HueyCockpit implements ICockpit {
    @Override
    public void checkCockpit() {
        System.out.println("Police helicopter cockpit check");
    }
}
