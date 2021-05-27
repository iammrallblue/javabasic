package org.javabasic.practices.algorithm;

import java.util.Arrays;

public class IntToInteger {
  /** int Array to Integer demo. */
  public static void main(String[] args) {
    // method 1, by for statement
    int[] intArray = { 9, 5, 2, 7 };
    Integer[] integers = new Integer[intArray.length];
    for (int i = 0; i < intArray.length; i++) {
      integers[i] = intArray[i];
    }
    System.out.println(Arrays.toString(integers));

    // method 2 calling stream method()
    Arrays.stream(intArray);
  }
}
