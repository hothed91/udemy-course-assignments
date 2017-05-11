package com.kathleensebree.Lessons;

/**
 * Lesson 5: Understanding Strings and Finishing up Primitive Data Types
 */
public class Lesson5 {

  /**
   * The 8 Primitive Data Types
   * ---------------------------
   * byte
   * short
   * long
   * int
   * float
   * double
   * char
   * boolean
   */
  public Lesson5() {

    /**
     * Strings
     */
    String myString = "This is my String";
    myString = myString + ", concatenated string";
    System.out.println(myString);

    String numberStr = "250.55";
    numberStr = numberStr + "49.95";
    System.out.println(numberStr);

    String lastStr = "10";
    int myInt = 50;
    System.out.println(lastStr + myInt);

  }
}
