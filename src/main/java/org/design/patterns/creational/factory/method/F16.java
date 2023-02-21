package org.design.patterns.creational.factory.method;

public class F16 {
    ICockpit cockpit;
    IEngine engine;

    protected F16 makeF16() {
        cockpit = new F16Cockpit();
        engine = new F16Engine();
        return this;
    }

    public void taxi() {
        System.out.println("F16 is taxing on the runway !");
    }

    public void fly() {
        /**
         * Note here carefully, the superclass F16 doesn't know
         * what type of F-16 variant it was returned.
         */
        F16 f16 = makeF16();
        System.out.println("F16 instance: " + f16);
        f16.taxi();
        System.out.println("F16 is in the air !\n");
    }
}
