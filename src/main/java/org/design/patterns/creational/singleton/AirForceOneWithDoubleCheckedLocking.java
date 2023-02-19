package org.design.patterns.creational.singleton;

/**
 * Rarely used because JVM has gotten faster,
 * meaning multiple threads will use the same instance of
 * a singleton class
 */
public class AirForceOneWithDoubleCheckedLocking {

    // The sole instance of the class. Note its marked volatile
    private volatile static AirForceOneWithDoubleCheckedLocking onlyInstance;

    // Make the constructor private so its only accessible to
    // members of the class.
    private AirForceOneWithDoubleCheckedLocking() {
    }

    public void fly() {
        System.out.println("AirForceOneWithDoubleCheckedLocking one is flying...");
    }

    // Create a static method for object creation
    synchronized public static AirForceOneWithDoubleCheckedLocking getInstance() {

        // Only instantiate the object when needed.
        if (onlyInstance == null) {
            // Note how we are synchronizing on the class object
            synchronized (AirForceOneWithDoubleCheckedLocking.class) {
                if (onlyInstance == null) {
                    onlyInstance = new AirForceOneWithDoubleCheckedLocking();
                }
            }
        }

        return onlyInstance;
    }
}
