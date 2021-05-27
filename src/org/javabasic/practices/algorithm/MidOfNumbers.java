package org.javabasic.practices.algorithm;

/*
  find out the midian value of any two numbers.
*/
public class MidOfNumbers {
  /** demo of median value. */
  public static void main(String[] args) {

    // method 1
    // int min = 10;
    // int max = 20;
    // int mid;
    // int mid = (min + max) / 2;
    // System.out.println("The midian value of " + min + " and " + max + "is: " +
    // mid);

    // method 2
    int min = 10;
    int max = 20;
    int mid = min + ((max - min) / 2);
    System.out.println("The median value is: " + mid);

    // // wrong way
    // int min = Integer.MAX_VALUE - 10;
    // int max = Integer.MAX_VALUE;
    // int mid = (min + max) / 2;
    // System.out.println("The median value is: " + mid);
    // // this method will cost the accuracy of the median value losing.

  } // main
}
