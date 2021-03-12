package org.javabasic.practices.inheritance;

// import java.util.Scanner;

/*
  Demo of vehicle rent. 
*/
public class DemoVehicleRent {
  /** Demo of Vehicle Class. */
  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Welcome to GOP Rental:");
    // System.out.print("Please select vehicle type:");
    // System.out.println("1. Car" + "\t2.Truck");
    // int selectItem = scanner.nextInt();
    // switch (selectItem) {
    // case 1:

    // }
    CarType car = new CarType();
    double rent = car.totalRent(2);
    System.out.println("total rent is: " + rent);
  } // main
}
