package org.javabasic.d03codes;

import java.util.Scanner;

/*
  Determine a three digits whether Narcissistic number or not.
*/
public class Demo07If {
  /** Determine the Narcissistic number. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input a three-digits number: ");
    int number = scanner.nextInt();
    if (number >= 100 && number <= 999) {
      // get hundreds
      int hundreds = number / 100;
      // get tens
      int tens = number % 100 / 10;
      // get ones.
      int ones = number % 10;

      // sum up cubes of ones, tens, and hundreds.
      int onesCube = ones * ones * ones;
      int tensCube = tens * tens * tens;
      int hundredsCube = hundreds * hundreds * hundreds;
      int totalCube = onesCube + tensCube + hundredsCube;
      if (number == totalCube) {
        System.out.println(number + " is a Narcissistic number.");
      } else {
        System.out.println(number + " is NOT a Narcissistic number.");
      }
    } else {
      System.out.println("Please input a three-digits number.");
    }
    scanner.close();
  } // main
}
