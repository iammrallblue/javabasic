package org.javabasic.d17codes;

/*
  Example of Lambda Expression:
    1. declare interface named Calculator, contains an abstract method
      the method sum up two ints, 
    2. using Lambda to call invokeCalc method, to calculate the summation of 
        120 and 130;
*/
public class Demo11Calculator {
  /** . */
  public static void main(String[] args) {
    // call invokeCalc()
    invokeCalc(10, 20, new Calculator() {

      @Override
      public int calc(int x, int y) {
        return x + y;
      }
    });

    // by lambda
    invokeCalc(120, 130, (int m, int n) -> {
      return m + n;
    });

    // optimized lambada expression
    System.out.println("optimized lambda expression.");
    invokeCalc(11, 22, (m, n) -> m + n);
  } // main

  // Method invokeCalc() with two int parameters and object of interface
  // Calculator.
  // inside of invokeCalc method to call the method calc from interface Calculator
  public static void invokeCalc(int x, int y, Calculator calculator) {
    int sum = calculator.calc(x, y);
    System.out.println("sum is: " + sum);
  }
}
