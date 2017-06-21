package com.kathleensebree.lessons.resources.computer;

/**
 * Created by Kathleen Sebree on 5/13/2017.
 */
public class Motherboard {

  private String model;
  private String manufacturer;
  private int ramSlots;
  private int pciSlots;
  private String bios;

  public Motherboard(String model, String manufacturer, int ramSlots, int pciSlots, String bios) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.ramSlots = ramSlots;
    this.pciSlots = pciSlots;
    this.bios = bios;
  }

  public String getModel() {
    return model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public int getRamSlots() {
    return ramSlots;
  }

  public int getPciSlots() {
    return pciSlots;
  }

  public String getBios() {
    return bios;
  }

  public void loadProgram(String programName) {
    System.out.println("Program " + programName + " is loading");
  }
}
