package org.javabasic.d03codes.practice;

/*
  Instance:
    using loop statements to find all EVEN number between 0 - 100, then sum up all EVEN numbers
      1. the range is 0 - 100, loop is less than 100 (i <= 100;)
      2. determining EVEN numbers by if statement
      3. needing a variable to sum up the total of all Even numbers.
*/
public class Demo10EvenNumber {
  public static void main(String[] args) {
    // forMethod();
    whileMethod();
  } // main

  /** Demo of Determine EVEN number by For loop. */
  public static void forMethod() {
    int sumEven = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.print(i + ", ");
        sumEven += i;
      }
      if (i % 12 == 0) {
        System.out.println();
      }
    }

    System.out.println("Sum of all Even number from 0 to 100: " + sumEven);
  }
  // public static void forMethod() {
  // int sumEven = 0; // for accumulating of even numbers
  // System.out.println("All Even numbers are: ");
  // for (int i = 1; i <= 100; i++) {
  // if (i % 2 == 0) {
  // System.out.print(i + ", "); // print out all even numbers;
  // sumEven += i; // adding all Even numbers;
  // }
  // } // for
  // System.out.println("The amount of all Even numbers is: " + sumEven);
  // }

  /** Demo of Determine EVEN number by While loop. */
  public static void whileMethod() {
    int sumEven = 0;
    int temp = 0;
    System.out.println("All EVEN numbers are: ");
    while (temp <= 100) {
      if (temp % 2 == 0) {
        sumEven += temp;
        System.out.print(temp + ", ");
      }
      if (temp % 10 == 0) {
        System.out.println();
      }
      temp++;
    } // while
    System.out.println("\nThe sum of all Even numbers is: " + sumEven);
  }
}
