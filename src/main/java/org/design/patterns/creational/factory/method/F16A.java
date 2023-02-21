package org.design.patterns.creational.factory.method;

public class F16A extends F16 {
    @Override
    protected F16 makeF16() {
        super.makeF16();
        engine = new F16AEngine();
        cockpit = new F16ACockpit();
        return this;
    }
}
