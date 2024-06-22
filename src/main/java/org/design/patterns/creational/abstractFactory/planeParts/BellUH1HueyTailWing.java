package org.design.patterns.creational.abstractFactory.planeParts;

import org.design.patterns.creational.abstractFactory.interfaces.ITailWing;

public class BellUH1HueyTailWing implements ITailWing {
    @Override
    public void checkTailWing() {
        System.out.println("Police helicopter tail wing check");
    }
}
