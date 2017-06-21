package com.kathleensebree.lessons;

import com.kathleensebree.lessons.resources.computer.*;
import com.kathleensebree.lessons.resources.house.Bed;
import com.kathleensebree.lessons.resources.house.Bedroom;
import com.kathleensebree.lessons.resources.house.Desk;
import com.kathleensebree.lessons.resources.house.Light;

/**
 * Created by Kathleen Sebree on 5/13/2017.
 */
public class Composition {

  public Composition() {
    Case theCase = new Case("220B", "Dell", "240", new Dimensions(5,5,5));
    Motherboard motherboard = new Motherboard("x97", "Asus", 4,4,"default");
    Monitor monitor = new Monitor("d43", "Asus", 24, new Resolution(1920, 1080));
    Computer computer = new Computer(theCase, monitor,motherboard);

    //computer.getMonitor().drawPixelAt(1500, 1200, "red");
    //computer.getMotherboard().loadProgram("Windows 1.0");
    //computer.getPcCase().turnOn();
    computer.powerUp();

    challenge();
  }

  /**
   * Challenge
   *
   * Create a single room of a house using composition
   * Think about the things that should be included in the room
   * Maybe physical parts of the house but furniture as well
   * Add at least one method to access an object via a getter and
   * then that objects public method as you saw in the previous video
   * then add at least one method to hide the object e.g. not using a getter
   * but to access the object used in composition within the main class
   * like you saw in this video
   */
  public void challenge() {
    Bedroom bedroom = new Bedroom("Kathleen",
            new Bed("Twin", 5,5,5),
            new Computer(
                    new Case("gh2", "ASus", "500", new Dimensions(5,5,5)),
                    new Monitor("fh3", "Asus", 24, new Resolution(5,5)),
                    new Motherboard("jnkj", "Asus",4,4,"default")),
            new Desk(5,5,5, "black"),
            new Light(3,true));

    System.out.println(bedroom.getOwner());
    bedroom.turnComputerOn();
    bedroom.turnLightsOff();
    bedroom.turnLightsOn();
    bedroom.getBed().makeBed();
  }
}
