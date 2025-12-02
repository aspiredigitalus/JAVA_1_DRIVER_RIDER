/*
Title: Rider.java
Description: This class represents a Rider with several methods.
Author: Aspiredigital
 */

package com.aspiredigital;

public class Rider {

    // Constructor
    public Rider() {
        System.out.println("com.aspiredigital.Rider created");
    }

    public void methodA () {
        System.out.println("Method A in com.aspiredigital.Rider");
    }

    public void methodB () {
        System.out.println("Method B in com.aspiredigital.Rider");
    }

    public String methodC () {
        return "Method C in com.aspiredigital.Rider";
    }

    public String methodD (char methodDParam) {
        return String.format("Method %c in com.aspiredigital.Rider", methodDParam);
    }
}
