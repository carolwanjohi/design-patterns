package org.design.patterns.creational.abstractFactory.planeParts;

import org.design.patterns.creational.abstractFactory.interfaces.IEngine;

public class F16Engine implements IEngine {
    @Override
    public void start() {
        System.out.println("F16 start engine");
    }
}
