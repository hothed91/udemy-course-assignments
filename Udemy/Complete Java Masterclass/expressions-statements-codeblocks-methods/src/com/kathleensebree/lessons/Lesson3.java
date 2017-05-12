package com.kathleensebree.lessons;

/**
 * Lesson 3: Code blocks and the if-then-else control statement
 */
public class Lesson3 {

  public Lesson3() {
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

/*    if(score < 5000 && score > 1000) {
      System.out.println("Your Score is less than 5000 but greater than 1000");
    } else if(score < 1000) {
      System.out.println("Your score was less than 1000");
    }else {
      System.out.println("Got Here");
    }*/

    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      System.out.println("Your final score was " + finalScore);
    }

    /**
     * Challenge
     * Print out a second score on the screen with the following:
     * - score set to 10000.
     * - levelCompleted set to 8
     * - bonus set to 200
     * - But make sure the first printout above still displays as well
     */

    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      System.out.println("Your final score was " + finalScore);
    }
  }
}
