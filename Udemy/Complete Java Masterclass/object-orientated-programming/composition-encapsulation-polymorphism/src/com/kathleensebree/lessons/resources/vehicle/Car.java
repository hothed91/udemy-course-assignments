package com.kathleensebree.lessons.resources.vehicle;

/**
 * Created by Kathleen Sebree on 5/13/2017.
 */
public class Car extends Vehicle {
  private int doors;
  private int engineCap;

  public Car(String name, int doors, int engineCap) {
    super(name);
    this.doors = doors;
    this.engineCap = engineCap;
  }

  public int getDoors() {
    return doors;
  }

  public int getEngineCap() {
    return engineCap;
  }
}
