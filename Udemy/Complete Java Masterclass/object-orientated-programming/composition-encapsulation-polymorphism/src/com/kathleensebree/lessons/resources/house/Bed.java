package com.kathleensebree.lessons.resources.house;

/**
 * Created by Kathleen Sebree on 5/13/2017.
 */
public class Bed {

  private String classification;
  private int height;
  private int depth;
  private int width;


  public Bed(String classification, int height, int depth, int width) {
    this.classification = classification;
    this.height = height;
    this.depth = depth;
    this.width = width;
  }

  public String getClassification() {
    return classification;
  }

  public int getHeight() {
    return height;
  }

  public int getDepth() {
    return depth;
  }

  public int getWidth() {
    return width;
  }

  public void makeBed() {
    System.out.println("Bed has been made");
  }
}
