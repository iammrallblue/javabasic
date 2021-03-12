package org.javabasic.d05codes.practice;

/*
  example:
    to find the max and min value in an Array.
*/
public class Demo09ArrayMaxValue {
  /** Demo of max and min values in an Array. */
  public static void main(String[] args) {
    // declare an Array
    int[] array = { 1, 2, 3, 4, 5, 7, 10, 20, 30 };

    // to compare all elements in the array
    int max = array[0];
    // to iterate all elements find max value then assign it to variable max.
    for (int i = 1; i < array.length; i++) { // i =1 b/c array[0] assigned to max.
      if (array[i] > max) {
        max = array[i];
      }
    }
    System.out.println("the max value in the array is: " + max);

    // to find min value
    int min = array[0];
    for (int j = 1; j < array.length; j++) {
      if (array[j] < min) {
        min = array[j];
      }
    }
    System.out.println("the min value in the array is: " + min);
  } // main
}