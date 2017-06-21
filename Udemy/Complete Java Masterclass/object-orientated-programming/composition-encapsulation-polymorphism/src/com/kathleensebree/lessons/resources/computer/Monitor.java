package com.kathleensebree.lessons.resources.computer;

/**
 * Created by Kathleen Sebree on 5/13/2017.
 */
public class Monitor {

  private String model;
  private String manufacturer;
  private int size;
  private Resolution nativeResolution;

  public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.size = size;
    this.nativeResolution = nativeResolution;
  }

  public String getModel() {
    return model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public int getSize() {
    return size;
  }

  public Resolution getNativeResolution() {
    return nativeResolution;
  }

  public void drawPixelAt(int x, int y, String color) {
    System.out.println("Drawing pixels at X: " + x + " y: " + y + " using color " + color);
  }
}
