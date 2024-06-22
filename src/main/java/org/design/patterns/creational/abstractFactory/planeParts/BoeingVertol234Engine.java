package org.design.patterns.creational.abstractFactory.planeParts;

import org.design.patterns.creational.abstractFactory.interfaces.IEngine;

public class BoeingVertol234Engine implements IEngine {
    @Override
    public void start() {
        System.out.println("Firefighting helicopter start engine");
    }
}
