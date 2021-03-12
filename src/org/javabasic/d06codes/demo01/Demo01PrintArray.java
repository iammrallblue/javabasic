package org.javabasic.d06codes.demo01;

import java.util.Arrays;

/*
    OPP (Procedural programming) and OOP (Object-oriented programming)

    the Instance below shows the difference of OPP and OOP
        to print out an array by for loop step by step.

    OOP used the Class Arrays' method to print out the same result as for loop

    3 factors of OOP:
      1. Encapsulation, 
      2. inheritance, 
      3. polymorphism 
      these are usually given as the three fundamental principles of 
      object-oriented languages (OOLs) and object-oriented methodology.
    *** method toString() is the encapsulation of the OPP programming.
        (see codes below)
*/
public class Demo01PrintArray {
  /** Difference of OPP and OOP. */
  public static void main(String[] args) {
    int[] intArray = { 1, 2, 3, 4, 5 };

    // call printMethod()
    // printMethod(intArray);

    // print out array by form [1,2,3,4,5] by OPP
    System.out.println("print out array by OPP.");
    System.out.print("[");

    // print out array by for loop
    for (int i = 0; i < intArray.length; i++) {

      // requires the if-statement to determine the last element of the array
      if (i == intArray.length - 1) {
        System.out.print(intArray[i] + "]");
      } else {
        System.out.print(intArray[i] + ", ");
      }
    }

    System.out.println("\nprint out an array by method toString() in Arrays Class: ");
    // this is the process-oriented program.

    // OOP object-oriented program below.
    System.out.println(Arrays.toString(intArray));
    // result is same as the process-oriented program above but more
    // simplified.
  } // main

  // /** to encapsulate OPP's steps into a method. */
  // public static void printMethod(int[] tempArray) {
  // // print out array by form [1,2,3,4,5] by OPP
  // System.out.print("[");

  // // print out array by for loop
  // for (int i = 0; i < tempArray.length; i++) {

  // // requires the if-statement to determine the last element of the array
  // if (i == tempArray.length - 1) {
  // System.out.print(tempArray[i] + "]");
  // } else {
  // System.out.print(tempArray[i] + ", ");
  // }
  // }
  // }
}