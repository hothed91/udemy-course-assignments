package com.kathleensebree.lessons.resources;

/**
 * Lesson 1 Challenge
 */
public class BankAccount {

  private long accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phoneNumber;

  public BankAccount(long accountNumber, double balance, String customerName, String email, String phoneNumber) {
    setAccountNumber(accountNumber);
    setBalance(balance);
    setCustomerName(customerName);
    setEmail(email);
    setPhoneNumber(phoneNumber);
  }

  public long getAccountNumber() {
    return accountNumber;
  }

  private void setAccountNumber(long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  private void setBalance(double balance) {
    this.balance = balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  private void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getEmail() {
    return email;
  }

  private void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  private void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * deposit
   */
  public double deposit(double deposit) {
    return this.balance += deposit;
  }

  public double withdrawl(double withdrawl) {
    if(withdrawl > this.balance) {
      System.out.println("insufficient funds. Trying to withdrawl " + withdrawl + " with balance of " + this.balance);
      return this.balance;
    }
    return this.balance - withdrawl;
  }
}


