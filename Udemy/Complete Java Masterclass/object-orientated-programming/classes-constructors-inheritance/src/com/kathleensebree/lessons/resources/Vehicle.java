package com.kathleensebree.lessons.resources;

/**
 * Created by Kathleen Sebree on 5/13/2017.
 */
public class Vehicle {

  private String name;
  private String size;

  private int currentVelocity;
  private int currentDirection;

  public Vehicle(String name, String size) {
    this.name = name;
    this.size = size;
    this.currentDirection = 0;
    this.currentVelocity = 0;
  }

  public String getName() {
    return name;
  }

  public String getSize() {
    return size;
  }

  public int getCurrentVelocity() {
    return currentVelocity;
  }

  public int getCurrentDirection() {
    return currentDirection;
  }

  public void steer(int direction) {
    this.currentDirection += direction;
    System.out.println("Vehicle.Steer: Steering at " + currentDirection + " degrees.");
  }

  public void move(int velocity, int direction) {
    this.currentDirection = direction;
    this.currentVelocity = velocity;
    System.out.println("Direction: " + this.currentDirection + "; Velocity: " + this.currentVelocity);
  }

  public void stop() {
    this.currentVelocity = 0;
  }
}
