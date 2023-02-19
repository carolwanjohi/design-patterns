package org.design.patterns.creational.singleton;

public class AirForceOne {
    // The sole instance of the class
    private static AirForceOne onlyInstance;

    // Make the constructor private so its only accessible to
    // members of the class.
    private AirForceOne() {
    }

    public void fly() {
        System.out.println("AirForceOne one is flying...");
    }

    // Create a static method for object creation
    public static AirForceOne getInstance() {

        // Only instantiate the object when needed.
        if (onlyInstance == null) {
            onlyInstance = new AirForceOne();
        }

        return onlyInstance;
    }
}
