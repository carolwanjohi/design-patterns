package org.design.patterns.creational.factory.method;

/**
 * Extending F16 class helps with:
 * 1. inheritance of methods and properties 
 * 2. application of the Liskov Substitution Principle. 
 **/
public class F16A extends F16 {
    /**
     * This is specialising the product creation by overriding
     * make method. 
     **/
    @Override
    protected F16 makeF16() {
        super.makeF16();
        engine = new F16AEngine();
        cockpit = new F16ACockpit();
        return this;
    }
}
