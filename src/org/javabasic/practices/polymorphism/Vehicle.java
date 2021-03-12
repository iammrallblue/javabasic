package org.javabasic.practices.polymorphism;

/*
  A Superclass named Vehicle.
*/
public class Vehicle {
  // fields
  String brand;
  String licPlate;

  // constructor
  public Vehicle() {

  }

  public Vehicle(String brand, String plate) {
    this.brand = brand;
    this.licPlate = plate;
  }

  /** instance method totalRent(). */
  public double totalRent(int days) {
    return 0.0;
  }
}
