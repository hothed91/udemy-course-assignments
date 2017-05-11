package com.kathleensebree.Lessons;

/**
 * Lesson 3: Getting to know Primitive Data Types - Float and Double
 */
public class Lesson3 {

  public Lesson3() {

    int myIntValue = 5 / 3;
    float myFloatValue = 1024f; // single precision
    double myDobuleValue = 5d / 3d; // double precision

    System.out.println("int value = " + myIntValue);
    System.out.println("float value = " + myFloatValue);
    System.out.println("double value = " + myDobuleValue);

    /**
     * Challenge 01
     */
    float floatChallenge = (float) 5.4; // other that 5.4f you can use casting

    /**
     * Challenge 02 : Convert a given number of pounds to kilograms
     * 1. Create a variable to store the number of pounds
     * 2. Calculate the number of Kilograms for the number above and store in a variable
     * 3. Print out the result.
     *
     * NOTES: 1 pound = 0.45359237 Kilograms
     */

    double pounds = 200d;
    double kilogramsPerPound = 0.453_592_37d;

    double result = pounds * kilogramsPerPound;
    System.out.println("\n" + result);

  }
}
