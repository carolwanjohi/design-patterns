package org.design.patterns.creational.prototype;

public interface IAircraftPrototype {
    void fly();

    IAircraftPrototype clone();

    void setEngine(IF16Engine f16Engine);

    void getEngine(String engineName);
}
