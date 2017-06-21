package com.kathleensebree.lessons.resources.computer;

/**
 * Created by Kathleen Sebree on 5/13/2017.
 */
public class Case {

  private String model;
  private String manufacturer;
  private String psu;
  private Dimensions dimensions;

  public Case(String model, String manufacturer, String psu, Dimensions dimensions) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.psu = psu;
    this.dimensions = dimensions;
  }

  public void turnOn(){
    System.out.println("Powering on");
  }

  public String getModel() {
    return model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public String getPsu() {
    return psu;
  }

  public Dimensions getDimensions() {
    return dimensions;
  }
}
