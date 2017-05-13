package com.kathleensebree.lessons;

import com.kathleensebree.lessons.resources.Animal;
import com.kathleensebree.lessons.resources.Dog;
import com.kathleensebree.lessons.resources.Fish;
import com.kathleensebree.lessons.resources.Outlander;

/**
 * Lesson 3: Inheritance
 */
public class Lesson3 {

  public Lesson3() {
    Animal animal = new Animal(1, 1, 1, 1, "animal");
    Dog dog = new Dog(1,1,"Dog", 2,4,1,1,"Long");
    Fish fish = new Fish(1,1,"Fish", 2,1,2);

    animal.eat();
    dog.eat();

    animal.move(5);
    dog.walk();
    dog.run();

    fish.swim(5);

    System.out.println("====================");

    challenge();
  }

  /**
   * Challenge
   * Start with a base class of a Vehicle. then create a Car class that inherits from this base class
   * Finally, create another class, a specific type of Car that inherits from the Car class.
   *
   * You should be able to hand steering, changing gears, and moving (speed in other words)
   * you will want to decide where to out the appropriate state and behaviors (fields and methods)
   * As mentioned above, changing gears, increasing/decreasing speed should be included.
   * For you specific type of vehicle you will want to add something specific for that type of Car.
   */

  public void challenge() {
    Outlander outlander = new Outlander(36);
    outlander.accelerate(30);
    outlander.accelerate(20);
    outlander.steer(45);
    outlander.accelerate(-42);
  }
}
