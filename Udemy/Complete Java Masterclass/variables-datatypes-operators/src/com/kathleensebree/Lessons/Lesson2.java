package com.kathleensebree.Lessons;

/**
 * Lesson 2: Getting to know Primitive Data Types - The Byte, Short, Int, and Long
 */
public class Lesson2 {

  public Lesson2() {
    /**
     * int
     */
    int intMin = -2_147_483_648; //int min
    int intMax = 2_147_483_647; //int max

    /**
     * byte
     */
    byte byteMin = -128; //byte min
    byte byteMax = 127; //byte max

    /**
     * short
     */
    short shortMin = -32_768; //short min
    short shortMax = 32_767; //short max

    /**
     * long
     */
    long longMin = -9_223_372_036_854_775_808L; //long min
    long longMax = 9_223_372_036_854_775_807L; //long max

    /**
     * casting
     */
    byte byteValue = (byte) (byteMax/2);
    System.out.println(byteValue);

    /**
     * Challenge solution
     */
    byte byteValue2 = 10;
    short shortValue = 20;
    int intValue = 50;

    long longTotal = 50_000L + 10L * (byteValue2 + shortValue + intValue);
    short shortTotal = (short) (1000 + 10 * (byteValue2 + shortValue + intValue));
    System.out.println("longTotal " + longTotal);
    System.out.println("shortTotal " + shortTotal);
  }
}
