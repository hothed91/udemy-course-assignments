package com.kathleensebree.lessons;

/**
 * Lesson 4: Methods
 * Lesson 5: More Methods and a Challenge
 */
public class Lesson4 {

  public Lesson4() {
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your final score is " + highScore);

    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your final score is " + highScore);

    displayHighScorePosition("Bob", calculateHighScorePosition(1500));
    displayHighScorePosition("Bill", calculateHighScorePosition(900));
    displayHighScorePosition("Sally", calculateHighScorePosition(400));
    displayHighScorePosition("Jack", calculateHighScorePosition(50));

  }

  public int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 2000;
      return finalScore;
    }
    return -1;
  }

  /**
   * Challenge
   * <p>
   * Create a method called displayHighScorePosition
   * it should have a players name as a parameter, and a 2nd parameter as a position in the high score table
   * you should display the players name along with a message like " managed to get into position " and the
   * position they got and a further message " on the high score table".
   * <p>
   * Create a 2nd method called calculateHighScorePosition
   * it should be sent one argument only, the player score.
   * ut should return an int
   * the return data should be
   * 1 -> if the score is >= 1000
   * 2 -> if the score is >= 500 and < 1000
   * 3 -> if the score is >= 100 and  < 500
   * 4 -> in all other cases
   * call both methods and display the results of the following
   * a score of 1500, 900, 400, and 50
   */
  public void displayHighScorePosition(String playerName, int position) {
    System.out.println(playerName + " managed to get into position "
            + position + " on the high score table");
  }

  public int calculateHighScorePosition(int playerScore) {
    if (playerScore >= 1000) {
      return 1;
    } else if (playerScore < 1000 && playerScore >= 500) {
      return 2;
    } else if (playerScore < 500 && playerScore >= 100) {
      return 3;
    }
    return 4;
  }

}
