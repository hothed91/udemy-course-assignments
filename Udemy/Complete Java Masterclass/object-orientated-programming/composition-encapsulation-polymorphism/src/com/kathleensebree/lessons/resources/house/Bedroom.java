package com.kathleensebree.lessons.resources.house;

import com.kathleensebree.lessons.resources.computer.Computer;

/**
 * Created by Kathleen Sebree on 5/13/2017.
 */
public class Bedroom {

  private String owner;
  private Bed bed;
  private Computer gamingPC;
  private Desk desk;
  private Light ceilingFanLights;

  public Bedroom(String owner, Bed bed, Computer gamingPC, Desk desk, Light ceilingFanLights) {
    this.owner = owner;
    this.bed = bed;
    this.gamingPC = gamingPC;
    this.desk = desk;
    this.ceilingFanLights = ceilingFanLights;
  }

  public String getOwner() {
    return owner;
  }

  public Bed getBed() {
    return bed;
  }

  public Desk getDesk() {
    return desk;
  }

  public void turnComputerOn() {
    gamingPC.powerUp();
  }

  public void turnLightsOn() {
    ceilingFanLights.switchLightOn();
    System.out.println("Lights on");
  }

  public void turnLightsOff() {
    ceilingFanLights.switchLightOff();
    System.out.println("Lights off");
  }

}
