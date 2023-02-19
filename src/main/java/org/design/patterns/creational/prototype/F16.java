package org.design.patterns.creational.prototype;

public class F16 implements IAircraftPrototype {
    IF16Engine f16Engine = new F16Engine();

    @Override
    public void fly() {
        System.out.println("F-16 flying...");
    }

    @Override
    public IAircraftPrototype clone() {
        /**
         * To deep clone self and return the product return `F16()`
         * To shallow clone return `this`
         */
        return new F16();
    }

    @Override
    public void setEngine(IF16Engine f16Engine) {
        this.f16Engine = f16Engine;
    }

    @Override
    public void getEngine(String engineName) {
        System.out.println("Engine's name: " + engineName);
        System.out.println("Engine: " + this.f16Engine);
    }
}
