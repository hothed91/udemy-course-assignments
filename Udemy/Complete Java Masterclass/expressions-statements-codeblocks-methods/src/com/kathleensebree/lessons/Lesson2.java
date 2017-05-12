package com.kathleensebree.lessons;

/**
 * Lesson 2: Statements, Whitespace, and indentation (Code Organization)
 */
public class Lesson2 {

  public Lesson2() {
    int myVariable = 50;
    if (myVariable == 50) {
      System.out.println("Printed");
    }

    myVariable++;
    myVariable--;
    System.out.println("This is a test");

    System.out.println("this is"
            + " another"
            + " statement");

    int anotherVariable = 5; myVariable--; //two statements on one line
  }
}
