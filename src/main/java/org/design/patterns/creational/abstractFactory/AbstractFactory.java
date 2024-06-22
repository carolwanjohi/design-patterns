package org.design.patterns.creational.abstractFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.design.patterns.creational.abstractFactory.factories.Boeing747Factory;
import org.design.patterns.creational.abstractFactory.factories.BoeingVertol234Factory;
import org.design.patterns.creational.abstractFactory.factories.F16Factory;
import org.design.patterns.creational.abstractFactory.factories.BellUH1HueyFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        F16Factory f16Factory = new F16Factory();
        Boeing747Factory boeing747Factory = new Boeing747Factory();

        Collection<Aircraft> aircrafts = new ArrayList<>();

        aircrafts.add(new Aircraft(f16Factory));
        aircrafts.add(new Aircraft(boeing747Factory));

        for (Aircraft aircraft: aircrafts) {
            aircraft.fly();
        }

        BellUH1HueyFactory bellUH1HueyFactory = new BellUH1HueyFactory();
        BoeingVertol234Factory boeingVertol234Factory = new BoeingVertol234Factory();

        Collection<Helicopter> helicopters = new ArrayList<>();

        helicopters.add(new Helicopter(bellUH1HueyFactory));
        helicopters.add(new Helicopter(boeingVertol234Factory));

        for (Helicopter helicopter: helicopters) {
            helicopter.verticalTakeOff();
        }
    }
}
