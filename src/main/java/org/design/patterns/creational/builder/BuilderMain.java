package org.design.patterns.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        F16Builder f16Builder = new F16Builder();

        f16Builder.buildEngine();
        f16Builder.buildCockpit();
        f16Builder.buildWings();

        /**
         * When an override function is not provided,
         * the builder's method is used
         */
        f16Builder.buildBathrooms();

        IAircraft f16 = f16Builder.getResult();

        System.out.println("--**************--");

        Boeing747Builder boeing747Builder = new Boeing747Builder();

        boeing747Builder.buildEngine();
        boeing747Builder.buildCockpit();
        boeing747Builder.buildWings();
        boeing747Builder.buildBathrooms();

        IAircraft boeing747 = boeing747Builder.getResult();
    }
}
