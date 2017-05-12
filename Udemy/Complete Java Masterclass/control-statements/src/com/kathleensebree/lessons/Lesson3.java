package com.kathleensebree.lessons;

/**
 * Lesson 3: The while and do-while statements
 */
public class Lesson3 {

  public Lesson3() {
    int count = 1;
    while (count != 6) {
      System.out.println("Count value is " + count);
      count++;
    }

    System.out.println("==============================");

    count = 1;
    while (true) {
      if (count == 6) {
        break;
      }
      System.out.println("Count value is " + count);
      count++;
    }

    System.out.println("==============================");

    count = 1;
    do {
      System.out.println("Count value was " + count);
      count++;
      if(count > 100) {
        break;
      }
    } while (count != 6);

    System.out.println("==============================");

    int number = 5;
    int finishNumber = 20;
    while (number <= finishNumber) {
      if(!isEvenNumber(number)) {
        number++;
        continue;
      }
      System.out.println("Even number " + number);
      number++;
    }

    challenge();

  }

  /**
   * Challenge
   *
   * Create a method called isEvenNumber that takes a parameter of type int
   * its purpose is to determine if the argument passed to the method is
   * an even number or not
   * return true if an even number, otherwise return false;
   */
  public boolean isEvenNumber(int n) {
    return (n%2==0);
  }

  /**
   * Challenge
   *
   * modify the while code above
   * make it also record the total number of even numbers it has found
   * and break once 5 are found
   * and at the end, display the total number of even numbers found
   */

  public void challenge() {
    int foundEven = 0;
    int number = 5;
    int finishNumber = 20;
    while (number <= finishNumber) {
      if(!isEvenNumber(number)) {
        number++;
        continue;
      }
      System.out.println("Even number " + number);
      foundEven++;
      if(foundEven == 5) {
        System.out.println(foundEven + " even numbers found");
        break;
      }
      number++;
    }
  }

}
