package org.javabasic.practices.recursive;

/*
  Demo of Recursive:

*/
public class Factorial {
  public static void main(String[] args) {
    System.out.println("the of factorial of " + " is: " + calcFactorial(0));
    System.out.println("the of factorial of " + " is: " + calcFactorial(4));
  } // main

  /** calculate factorial of a number. */
  public static int calcFactorial(int x) {
    if (x == 0 || x == 1) {
      return 1;
    }
    return x * calcFactorial(x - 1); // return 2 * 1
  }
}
