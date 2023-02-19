package org.design.patterns.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        AirForceOne airForceOne = AirForceOne.getInstance();
        airForceOne.fly();

        System.out.println("--**************--");

        AirForceOneWithDoubleCheckedLocking airForceOneTwo = AirForceOneWithDoubleCheckedLocking.getInstance();
        airForceOneTwo.fly();
    }
}
