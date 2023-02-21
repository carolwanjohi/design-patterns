package org.design.patterns.creational.factory.method;

import java.util.ArrayList;
import java.util.Collection;

public class FactoryMethod {
    public static void main(String[] args) {
        Collection<F16> myAirForce = new ArrayList<>();

        F16 f16A = new F16A();
        F16 f16A2 = new F16A();
        F16 f16B = new F16B();

        myAirForce.add(f16A);
        myAirForce.add(f16A2);
        myAirForce.add(f16B);

        for (F16 f16 : myAirForce) {
            f16.fly();
        }

        java.text.NumberFormat.getInstance();
        java.util.Calendar.getInstance();

    }
}
