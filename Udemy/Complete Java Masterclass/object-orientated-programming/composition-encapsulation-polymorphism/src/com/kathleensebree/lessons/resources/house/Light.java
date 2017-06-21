package com.kathleensebree.lessons.resources.house;

/**
 * Created by Kathleen Sebree on 5/13/2017.
 */
public class Light {

  private int numOfBulbs;
  private boolean isOn;

  public Light(int numOfBulbs, boolean isOn) {
    this.numOfBulbs = numOfBulbs;
    this.isOn = isOn;
  }

  public void switchLight() {
    this.isOn = !this.isOn;
  }

  public void switchLightOn() {
    this.isOn = true;
  }

  public void switchLightOff() {
    this.isOn = false;
  }
}
