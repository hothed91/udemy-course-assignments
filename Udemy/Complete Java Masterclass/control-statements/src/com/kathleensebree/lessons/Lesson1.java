package com.kathleensebree.lessons;

/**
 * Lesson 1: The Switch statement
 */
public class Lesson1 {

  public Lesson1() {
    int switchValue = 4;

    switch(switchValue) {
      case 1 :
        System.out.println("value was 1");
        break;
      case 2 :
        System.out.println("value was 2");
        break;
      case 3:case 4:case 5:
        System.out.println("Value was 3 or 4 or 5");
        break;
      default:
        System.out.println("was not 1 or 2");
        break;
    }

    challenge();
    stringSwitch();
  }

  /**
   * Challenge
   * --------------------------------------------------------
   * Create a new switch statement using char instead of int
   * create a new char variable
   * create a switch statement testing for
   * A, B, C, D, or E
   * display a message if any of these are found and then break
   * Add a default which displays a message saying not found
   */
  public void challenge() {
    char variable = 'F';
    switch(variable) {
      case 'A':
      case 'B':
      case 'C':
      case 'D':
      case 'E':
        System.out.println(variable + " was found");
        break;
      default:
        System.out.println("none of the cases were found");
        break;
    }
  }

  public void stringSwitch() {
    String month = "Jan";
    switch (month.toLowerCase()) {
      case "jan":
        System.out.println(month);
        break;
      case "feb":
        System.out.println(month);
        break;
      default:
        System.out.println(month + "is not listed");
        break;
    }
  }
}
