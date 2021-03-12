package org.javabasic.d04codes;

import java.util.Scanner;

/*
    Class Scanner:
        to get values from keyboard.
*/
public class Demo09SumNumbers {
  /** example. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input two numbers:");
    // double x = scanner.nextDouble();
    // double y = scanner.nextDouble();
    // System.out.println("the sum from " + x + " to " + y + " is: " + sumNumbers(x,
    // y));

    int x = scanner.nextInt();
    int y = scanner.nextInt();
    // System.out.println("the power " + y + " of " + x + " is: " + powerOfNumber(x,
    // y));
    System.out.print("the sum of all EVEN numbers from ");
    System.out.println(x + " to " + y + " is: " + sumEvenNumbers(x, y));
    scanner.close();
  } // main

  /** declare a method to sum a total from one number to another number. */
  public static double sumNumbers(double x, double y) {
    // return x + y;
    // if x > y the sum will be 0, add if-statement to prevent x > y
    if (x > y) {
      double z = x;
      x = y;
      y = z;
    }
    double sum = 0;
    for (double i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  /** declare a method to calculate the n power of a number. */
  public static int powerOfNumber(int x, int y) { // x is a number, y is the n power of the number.
    int power = 1; // multiple cannot be 0;
    for (int i = 1; i <= y; i++) {
      power *= x;
    }
    return power;
  }

  /**
   * declare a method to sum up the total from one number to another number (EVEN
   * ONLY).
   *
   * @param start a number start from.
   * @param end   a number end to.
   */
  public static int sumEvenNumbers(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      // determine if i whether a even number or odd.
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
