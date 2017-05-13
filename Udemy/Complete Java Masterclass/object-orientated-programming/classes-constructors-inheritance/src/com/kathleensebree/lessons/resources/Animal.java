package com.kathleensebree.lessons.resources;

/**
 * Created and Discussed in Lesson 3
 */
public class Animal {
  private int brain;
  private int body;
  private int size;
  private int weight;
  private String name;

  public Animal(int brain, int body, int size, int weight, String name) {
    this.brain = brain;
    this.body = body;
    this.size = size;
    this.weight = weight;
    this.name = name;
  }

  public int getBrain() {
    return brain;
  }

  public int getBody() {
    return body;
  }

  public int getSize() {
    return size;
  }

  public int getWeight() {
    return weight;
  }

  public String getName() {
    return name;
  }

  public void eat() {
    System.out.println(this.name + " is eating");
  }

  public void move(int speed) {
    System.out.println(this.name + " is moving at " + speed + "mph");
  }
}
