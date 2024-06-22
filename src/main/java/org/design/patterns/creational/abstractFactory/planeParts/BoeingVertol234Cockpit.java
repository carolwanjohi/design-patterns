package org.design.patterns.creational.abstractFactory.planeParts;


import org.design.patterns.creational.abstractFactory.interfaces.ICockpit;

public class BoeingVertol234Cockpit implements ICockpit {
    @Override
    public void checkCockpit() {
        System.out.println("Firefighting helicopter cockpit check");
    }
}
