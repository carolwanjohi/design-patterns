package org.design.patterns.creational.abstractFactory.planeParts;

import org.design.patterns.creational.abstractFactory.interfaces.ITailWing;

public class BoeingVertol234TailWing implements ITailWing {
    @Override
    public void checkTailWing() {
        System.out.println("Firefighting helicopter tail wing check");
    }
}
