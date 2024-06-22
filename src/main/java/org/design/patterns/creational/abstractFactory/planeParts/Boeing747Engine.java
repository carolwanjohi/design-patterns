package org.design.patterns.creational.abstractFactory.planeParts;

import org.design.patterns.creational.abstractFactory.interfaces.IEngine;

public class Boeing747Engine implements IEngine {
    @Override
    public void start() {
        System.out.println("Boeing747 start engine");
    }
}
