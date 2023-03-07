package org.design.patterns.creational.abstractFactory.planeParts;

import org.design.patterns.creational.abstractFactory.interfaces.IWings;

public class F16Wings implements IWings {
    @Override
    public void checkWings() {
        System.out.println("F16 wing check");
    }
}
