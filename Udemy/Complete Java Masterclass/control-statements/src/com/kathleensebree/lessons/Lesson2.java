package com.kathleensebree.lessons;

/**
 * Lesson 2: The for Statement
 */
public class Lesson2 {

  public Lesson2() {
    System.out.println("10,000 at 2% interest = " + calculateInterest(10_000d, 2.0d));
    System.out.println("10,000 at 3% interest = " + calculateInterest(10_000d, 3.0d));
    System.out.println("10,000 at 4% interest = " + calculateInterest(10_000d, 4.0d));
    System.out.println("10,000 at 5% interest = " + calculateInterest(10_000d, 5.0d));

    challenge();
    System.out.println("==============================");
    challenge2();
    System.out.println("==============================");
    challenge3();
  }

  private boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }

    for(int i = 2; i <= n/2 ; i++) {
      if(n % i == 0) {
        return false;
      }
    }

    return true;
  }

  public double calculateInterest(double amt, double rate) {
    return (amt * (rate/100));
  }

  /**
   * Challenge
   *
   * using the for statement, call the calculateInterest method with
   * the amt of 10000 with an interest rate of 2-8
   * and print the result to the console.
   */
  public void challenge() {
    for(int i = 2; i <=8 ; i++) {
      System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f", calculateInterest(10_000d, i)));
    }
  }

  /**
   * Challenge
   *
   * how would you modify the for loop above to do the same thing as
   * shown but to start from 8 and work back to 2;
   */
  public void challenge2() {
    for(int i = 8; i >=2 ; i--) {
      System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f", calculateInterest(10_000d, i)));
    }
  }

  /**
   * Challenge
   *
   * create a for statement using any range of numbers
   * determine if the number is a prime number using the isPrime method
   * if it is a prime number, print it out AND increment a count of the
   * number of prime numbers found
   * if that count is 3 exit the for loop
   * hint: use the break; statement to exit
   */
  public void challenge3() {
    int count = 0;
    for(int i = 10; i < 50; i++) {
      if(isPrime(i)) {
        System.out.println(i);
        count++;
        if(count == 10){
          System.out.println("exiting for loop");
          break;
        }
      }

    }
  }
}
