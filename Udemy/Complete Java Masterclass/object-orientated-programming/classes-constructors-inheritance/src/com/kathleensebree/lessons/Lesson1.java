package com.kathleensebree.lessons;

import com.kathleensebree.lessons.resources.BankAccount;
import com.kathleensebree.lessons.resources.Car;
import com.kathleensebree.lessons.resources.VipCustomer;

/**
 * Lesson 1: Classes
 * Lesson 2: Constructors
 */
public class Lesson1 {

  public Lesson1() {
    Car porsche = new Car(); //Local Variables
    Car holden = new Car();

    porsche.setModel("Carrera");
    System.out.println(porsche.getModel());

    challenge();
    challenge2();
  }

  /**
   * Challenge
   * <p>
   * Create a new class for a bank account
   * Create fields for the account number, balance, customer name, email, and phone number
   * <p>
   * Create getters and setters for each field
   * Create two additional methods
   * 1. to allow the customer to deposit funds(this should increment the balance field)
   * 2. to allow the customer to withdraw funds (this should decrement the balance field)
   * but not allow the withdrawal to complete if there is insufficient funds.
   * <p>
   * you will want to create various code in the Main class to confirm your code is working
   * Add some system.out.println's in the two methods above as well.
   */
  private void challenge() {
    BankAccount bobAccount = new BankAccount(11111L, 85.65, "Bob", "bob@builder.com", "800-545-5454");
    System.out.println(bobAccount.getBalance());
    System.out.println(bobAccount.deposit(5));
    System.out.println(bobAccount.withdrawl(91));
  }

  /**
   * Challenge 2
   *
   * Create a new class, VipCustomer
   * it should have 3 fields; name, credit limit, and email address
   * Create 3 constructors
   * 1st : empty, should call the 3rd with default values
   * 2nd : should pass on the 2 values it receives and add a default value for the 3rd
   * 3rd : should save all the fields.
   * create getters only for this using code gen. of intellij as setters won't be needed
   * test and confirm it works
   *
   */
  public void challenge2() {
    VipCustomer vp = new VipCustomer("Tim", 1000, "tim@email.com");
    System.out.println(vp.getName() + ", " + vp.getEmail() + ", " + vp.getCreditLimit());

    VipCustomer vp2 = new VipCustomer("Tim", 1000);
    System.out.println(vp2.getName() + ", " + vp2.getEmail() + ", " + vp2.getCreditLimit());

    VipCustomer vp3 = new VipCustomer();
    System.out.println(vp3.getName() + ", " + vp3.getEmail() + ", " + vp3.getCreditLimit());
  }
}
