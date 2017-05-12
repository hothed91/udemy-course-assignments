package com.kathleensebree.lessons;

/**
 * Lesson 5 : Method Overloading
 *
 */
public class Lesson5 {

  public Lesson5() {
    int score = calculateScore("Tim", 500);
    System.out.println("New Score is " + score);
    calculateScore(75);
    calculateScore("Bob");
    calculateScore();

    System.out.println();
    System.out.println(calcFeetAndInchesToCentimeters(6,0));
    System.out.println(calcFeetAndInchesToCentimeters(6*12));
  }

  public int calculateScore(String playerName, int score) {
    System.out.println("player " + playerName + " scored " + score + " points");
    return score * 1000;
  }

  public int calculateScore(int score) {
    System.out.println("Unnamed player" + " scored " + score + " points");
    return score * 1000;
  }

  public int calculateScore(String player) {
    System.out.println("player " + player + " scored " + 1000 + " points");
    return 1000 * 1000;
  }

  public int calculateScore() {
    System.out.println("no player name or score");
    return 0;
  }


  /**
   * Challenge
   * Create a method called calcFeetAndInchesToCentimeters
   * it needs to have two parameters
   * feet is the 1st, inches is the 2nd
   *
   * you should validate that the first parameter feet is >= 0
   * you should validate that the second parameter inches is >= 0 and <=12
   * return -1 from the method if either of the above is not true
   *
   * if the parameters are valid, then calculate how many centimeters
   * comprise the feet and inches passed to this method and return that value
   *
   * Create a 2nd method of the same name but with only one parameter
   * inches is the parameter
   * validate that its >=0
   * return -1 if it is not true
   * But if its valid, then calculate how many feet are in the inches and then here is the tricky part
   *
   * call the other overloaded method passing the correct feet and inches
   * calculated so that it can calculate correctly
   *
   * HINTS: use double for your number dataTypes is probably a good idea
   * 1 inch = 2.54cm and 1 foot = 12 inches
   * use the link i give you to confirm you code is calculating correctly.
   * Calling another overloaded method just requires you to use the right number of parameters
   */

  public double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if(!(feet >= 0 && inches >= 0 && inches <=12)){
      System.out.println("Invalid input");
      return -1;
    }
    return ((feet * 12) + inches) * 2.54;
  }

  public double calcFeetAndInchesToCentimeters(double inches) {
    if(inches < 0) {
      System.out.println("Invalid input");
      return -1;
    }

    //return ((inches / 12) + (inches % 12)) * 2.54;
    return calcFeetAndInchesToCentimeters(inches / 12, inches % 12);
  }

}
