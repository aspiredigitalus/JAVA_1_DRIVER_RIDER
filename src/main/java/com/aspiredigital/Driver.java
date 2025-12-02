/*
Title: com.aspiredigital.Driver.java
Description: This is the main driver class for the Java application.
Author: Aspiredigital
 */
package com.aspiredigital;

public class Driver {
    public static void main(String[] args) {
        System.out.println("This is the main method of the driver class");
        Rider rider = new Rider();

        rider.methodA();
        rider.methodB();
        String methodCString = rider.methodC();
        System.out.println(methodCString);

    }
}
