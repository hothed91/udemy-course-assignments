package com.kathleensebree.lessons.resources;

/**
 * Created and Discussed in Lesson 1 and Lesson 3 Challenge
 */
public class Car extends Vehicle {

  //class variables | member variables | fields
  private int doors;
  private int wheels;
  private int currentGear;
  private boolean isManual;
  private String model;
  private String engine;
  private String color;

  public Car(String name, String size, int doors, int wheels, int currentGear, boolean isManual) {
    super(name, size);
    this.doors = doors;
    this.wheels = wheels;
    this.currentGear = 1;
    this.isManual = isManual;
  }

  public Car() {
    super("default", "default");
  }

  public void changeGear(int currentGear) {
    this.currentGear = currentGear;
    System.out.println("Gear: " + this.currentGear);
  }

  public void changeVelocity(int speed, int direction) {
    move(speed, direction);
    System.out.println("Car changing Velocity " + this.getCurrentVelocity() + " and direction " + this.getCurrentDirection());
  }

  public int getDoors() {
    return doors;
  }

  public int getWheels() {
    return wheels;
  }

  public int getCurrentGears() {
    return currentGear;
  }

  public boolean isManual() {
    return isManual;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
