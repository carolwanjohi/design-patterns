package org.design.patterns.creational.abstractFactory.planeParts;

import org.design.patterns.creational.abstractFactory.interfaces.IEngine;

public class BellUH1HueyEngine implements IEngine {
    @Override
    public void start() {
        System.out.println("Police helicopter start engine");
    }
}
