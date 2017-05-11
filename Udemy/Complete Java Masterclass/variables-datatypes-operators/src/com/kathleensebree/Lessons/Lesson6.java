package com.kathleensebree.Lessons;

/**
 * Lesson 6: Operators
 * Lesson 7: More on Operators and Operators precedence.
 */
public class Lesson6 {

  public Lesson6() {
    int result = 1 + 2; // equals operator and addition operator
    System.out.println(result);

    int previousResult = result;
    result = result - 1;
    System.out.println(previousResult + " - 1 = " + result);

    previousResult = result;
    result = result * 10;
    System.out.println(previousResult + " * 10 = " + result);

    previousResult = result;
    result = result / 5;
    System.out.println(previousResult + " / 5 = " + result);

    previousResult = result;
    result = result % 3;
    System.out.println(previousResult + " % 3 = " + result);

    result = result + 1;
    System.out.println("Result is now " + result);
    result++;
    System.out.println("Result is now " + result);
    result--;
    System.out.println("Result is now " + result);

    result+=2;
    System.out.println("Result is now " + result);
    result*=10;
    System.out.println("Result is now " + result);
    result-=10;
    System.out.println("Result is now " + result);
    result/=10;
    System.out.println("Result is now " + result);

    boolean isAlien = false;
    if (isAlien == false) { //equality operator - is the left and right of the double equals the same. this is typically used for literals except Strings
      System.out.println("It is not an alien!");
    }

    int topScore = 100;
    if(topScore != 100) { // != is testing whether the left and right are NOT equal to each other.
      System.out.println("You got the highest score");
    }

    if(topScore < 100) { // < is testing whether the left is less than the right. There is also <=
      System.out.println("You got the highest score");
    }

    if(topScore > 100) { // > is testing whether the left is greater than the right. there is also >=
      System.out.println("You got the highest score");
    }

    // AND
    int secondTopScore = 60;
    if(topScore > secondTopScore && secondTopScore <= 100) {
      System.out.println("Greater than second top score and less than 100");
    }

    // OR
    if(topScore > secondTopScore || secondTopScore <= 100) {
      System.out.println("Greater than second top score and less than 100");
    }

    boolean isCar = false;
    if (isCar = true) {
      System.out.println("This is not supposed to happen");
    }

    isCar = true;
    //ternary operator
    boolean wasCar = isCar ? true : false;
    if (wasCar) {
      System.out.println("wasCar is true");
    }

    /**
     * challenge
     * 1. Create a double variable with the value of 20
     * 2. create a second variable of type double with the value of 80;
     * 3. Add both numbers and multiply by 25
     * 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
     * 5. Write an "if" statement that displays a message "Total was over the limit"
     *    if the remaining total (#4) is equal to 20 or less.
     */

    double first = 20d;
    double second = 80d;
    double result2 = (first + second) * 25;
    result2 %=40;
    if(result2 <= 20) {
      System.out.println("Total was over the limit");
    }

  }
}
