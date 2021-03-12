package org.javabasic.d05codes;

/*
  A Class named Computer.  
*/
public class Computer {
  // fields, instance variables.
  String brand;
  String color;
  double size;
  double price;

  // instance methods
  /** to show spec of a computer. */
  public void showSpec() {
    System.out.println("Brand: " + brand); // default value, null
    System.out.println("Color: " + color); // default value, null
    System.out.println("Size: " + size);; // default value, 0.0
    System.out.println("Price: " + price); // default value, 0.0
  }
}
