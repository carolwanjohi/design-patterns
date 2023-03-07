package org.design.patterns.creational.abstractFactory.planeParts;


import org.design.patterns.creational.abstractFactory.interfaces.ICockpit;

public class Boeing747Cockpit implements ICockpit {
    @Override
    public void checkCockpit() {
        System.out.println("Boeing747 cockpit check");
    }
}
