package org.design.patterns.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        IAircraftPrototype prototype = new F16();
        prototype.getEngine("Default");

        System.out.println("--**************--\n");

        IAircraftPrototype f16A = prototype.clone();
        f16A.setEngine(new F16AEngine());
        f16A.getEngine("F16AEngine");

        System.out.println("--**************--\n");

        /**
         * Not setting F16BEngine
         *  When shallow cloning:
         *      If engine F16AEngine is set, but F16BEngine
         *      is not set, the engine for f16B is the same as
         *      f16A.
         * <p>
         *  When deep cloning:
         *      A new engine is created, different from prototype
         *      and f16A.
         */
        IAircraftPrototype f16B = prototype.clone();
        f16B.setEngine(new F16BEngine());
        f16B.getEngine("F16BEngine");
    }
}
