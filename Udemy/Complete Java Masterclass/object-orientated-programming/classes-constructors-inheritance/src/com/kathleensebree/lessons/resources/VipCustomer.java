package com.kathleensebree.lessons.resources;

/**
 * Created by Kathleen Sebree on 5/12/2017.
 */
public class VipCustomer {

  private String name;
  private double creditLimit;
  private String email;

  public VipCustomer() {
    this("Default Bob", 100.0, "default@email.com");
  }

  public VipCustomer(String name, double creditLimit) {
    this(name, creditLimit, "default@email.com");
  }

  public VipCustomer(String name, double creditLimit, String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public String getEmail() {
    return email;
  }
}
