package com.kathleensebree.lessons.resources;

/**
 * Created by Kathleen Sebree on 5/12/2017.
 */
public class Fish extends Animal {
  private int gills;
  private int fins;
  private int eyes;

  public Fish(int size, int weight, String name, int gills, int fins, int eyes) {
    super(1, 1, size, weight, name);
    this.gills = gills;
    this.fins = fins;
    this.eyes = eyes;
  }

  private void rest() {

  }

  private void moveMuscles() {

  }

  private void moveBackFin() {

  }

  public void swim(int speed) {
    moveMuscles();
    moveBackFin();
    super.move(speed);
  }
}
