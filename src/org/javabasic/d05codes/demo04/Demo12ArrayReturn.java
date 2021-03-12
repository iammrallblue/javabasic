package org.javabasic.d05codes.demo04;

// An array used as a return value of a method
public class Demo12ArrayReturn {
  /** Demo of an Array as a return value. */
  public static void main(String[] args) {
    // to show results from method calculation()
    int[] result = calculation(2, 5, 9);
    System.out.println("the sum of numbers is: " + result[0]);
    System.out.println("the product of numbers is: " + result[1]);
    System.out.println("the average of numbers is: " + result[2]);
  } // main

  /** a method for calculation. */
  public static int[] calculation(int x, int y, int z) {
    int sum = x + y + z;
    int product = x * y * z;
    int average = sum / 3;
    // the method needs to return 3 values, therefore, it needs an array to store 3
    // values.

    int[] resultArray = { sum, product, average };
    return resultArray;
    // Any datatype can use as a parameter or return values for methods.

    // Array can use as a parameter or return value, but the memory address is
    // passed
    // by. the array "results" and "resultArray" should have the same memory
    // address.
  }
}