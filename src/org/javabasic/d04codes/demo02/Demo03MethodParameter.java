package org.javabasic.d04codes.demo02;

/*
  Method with parameter and return value:
    see parameterMethod()

  Instance:
    a method which can calculate the sum of two values.

  example:
    a method with return value
    (see getSum())
*/
public class Demo03MethodParameter {
  /** Demo of a method with parameter and return value. */
  public static void main(String[] args) {
    // calling parameterMethod()
    parameterMethod(3, 55);

    int returnSum = getSum(55, 13);
    System.out.println("the return value is: " + returnSum);

    // calling sumValues()
    sumValues(55, 21);
  } // main

  public static void parameterMethod(int x, int y) {
    int product = x * y;
    System.out.println("the product of x and y is: " + product);
  }

  // a method with two parameters to sum up the sum of two values
  public static int getSum(int x, int y) {
    int sum = x + y;
    return sum;
  }

  // a method with two parameters to sum up the sum of two values, no return value
  public static void sumValues(int x, int y) {
    int sum = x + y;
    System.out.println("print out the sum by myself: " + sum);
  }
}
