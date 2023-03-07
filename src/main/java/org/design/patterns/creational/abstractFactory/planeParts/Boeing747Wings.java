package org.design.patterns.creational.abstractFactory.planeParts;

import org.design.patterns.creational.abstractFactory.interfaces.IWings;

public class Boeing747Wings implements IWings {
    @Override
    public void checkWings() {
        System.out.println("Boeing747 wing check");
    }
}
