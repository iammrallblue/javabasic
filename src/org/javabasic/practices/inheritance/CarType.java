package org.javabasic.practices.inheritance;

/*
  A Subclass CarType extends from Superclass Vehicle.
*/
public class CarType extends Vehicle {
  // fields
  String carType; // car type

  public CarType() {

  }

  public CarType(String brand, String licPlate, String carType) {
    super(brand, licPlate);
    this.carType = carType;
  }

  @Override
  public double totalRent(int days) {
    // get daily rent by carType.
    switch (this.carType) {
      case "Compact":
        return 50 * days;
      case "Sedan":
        return 70 * days;
      case "SUV":
        return 120 * days;
      case "VAN":
        return 200 * days;
      case "Pick-up Truck":
        return 230 * days;
      default:
        return 0;
    }
  }
}
