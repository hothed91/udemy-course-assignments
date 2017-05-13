package com.kathleensebree.lessons.resources;

/**
 * Created and Discussed in Lesson 3
 */
public class Dog extends Animal {

  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;

  public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
    super(1, 1, size, weight, name);
    this.eyes = eyes;
    this.legs = legs;
    this.tail = tail;
    this.teeth = teeth;
    this.coat = coat;
  }

  public int getEyes() {
    return eyes;
  }

  public int getLegs() {
    return legs;
  }

  public int getTail() {
    return tail;
  }

  public int getTeeth() {
    return teeth;
  }

  public String getCoat() {
    return coat;
  }

  private void chew() {
    System.out.println(getName() + " is chewing");
  }

  public void walk() {
    move(5);
  }

  public void run() {
    move(10);
  }

  @Override
  public void eat() {
    super.eat();
    chew();
  }

  @Override
  public void move(int speed) {
    super.move(speed);
  }
}
