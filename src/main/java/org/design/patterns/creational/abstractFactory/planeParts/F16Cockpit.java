package org.design.patterns.creational.abstractFactory.planeParts;


import org.design.patterns.creational.abstractFactory.interfaces.ICockpit;

public class F16Cockpit implements ICockpit {
    @Override
    public void checkCockpit() {
        System.out.println("F16 cockpit check");
    }
}
