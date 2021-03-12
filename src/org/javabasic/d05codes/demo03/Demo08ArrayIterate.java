package org.javabasic.d05codes.demo03;

/*
  iterating an array means to print out all elements in it.
*/
public class Demo08ArrayIterate {
  /** Demo of array iteration. */
  public static void main(String[] args) {
    int[] intArray = { 15, 25, 30, 45, 55 };
    int element;

    // iterating over the array by for loop
    for (int i = 0; i < intArray.length; i++) {
      element = intArray[i];
      System.out.println(element);
    } // for
    // for loop starts from 0 b/c the array's index is started from [0]
  } // main
}