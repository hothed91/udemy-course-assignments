package com.kathleensebree.lessons.resources.computer;

/**
 * Created by Kathleen Sebree on 5/13/2017.
 */
public class Computer {
  private Case pcCase;
  private Monitor monitor;
  private Motherboard motherboard;

  public Computer(Case pcCase, Monitor monitor, Motherboard motherboard) {
    this.pcCase = pcCase;
    this.monitor = monitor;
    this.motherboard = motherboard;
  }

//  private Case getPcCase() {
//    return pcCase;
//  }
//
//  private Monitor getMonitor() {
//    return monitor;
//  }
//
//  private Motherboard getMotherboard() {
//    return motherboard;
//  }

  public void powerUp() {
    pcCase.turnOn();
    drawLogo();
  }

  private void drawLogo() {
    //Fancy Graphics
    monitor.drawPixelAt(1200,50,"Yellow");
  }
}
