package org.design.patterns.creational.factory.method;

public class F16B extends F16 {
    @Override
    protected F16 makeF16() {
        super.makeF16();
        engine = new F16BEngine();
        cockpit = new F16BCockpit();
        return this;
    }
}
