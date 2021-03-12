package org.javabasic.d04codes;

import java.util.Scanner;

/*
    Ex4.
      [x,y] : (int(Math.random() * (y - x + 1) + x)), acquire a number within range of [x, y]
*/
public class DemoIfElseExs {
  public static void main(String[] args) {
    printMethod();
    printMethod2();
    printMethod3();
  } // main

  // 1. determine if the sum of two values equals to 50, then print out
  // "Hello,Bella"
  public static void printMethod() {
    int x = 40;
    int y = 50;
    if (x + y == 50) {
      System.out.println("Hello,Bella!");
    } else {
      System.out.println("x = " + x + ", " + "y = " + y);
    }
  } // printMethod

  // 2.determine two double values, if int is greater than 10.0, another is less
  // than 20.0
  // print out the sum of two variables,otherwise, print out the product of two
  // variables.
  public static void printMethod2() {
    double m = 12.3;
    double n = 20.5;
    if (m > 10.0 && n < 20.0) {
      System.out.println("The sum is: " + (m + n));
    } else {
      System.out.println("The product is: " + (m * n));
    }
  } // printMethod2

  // 3. calculate the age of the dog, the first two years of dog is equal to 2 *
  // 10.5
  // after two years, each year is equal to 4 years of human being's age.
  public static void printMethod3() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter doggys' age: ");
    double age = scanner.nextDouble();
    if (age > 0 && age <= 2) {
      System.out.println("The dog's age is: " + age);
      System.out.println(age + " is equivalent to human's age: " + (age * 10.5));
    } else if (age > 2) {
      System.out.println("The dog's age is: " + age);
      System.out.println(age + " is equivalent to human's age: " + ((2 * 10.5) + ((age - 2) * 4)));
    } else if (age <= 0) {
      System.out.println("data is inadequate.");
    }
    scanner.close();

    // 4. get a random number by using Math.random(); the range (10 - 99)
    int intValue = (int) (Math.random() * 90 + 10);
    System.out.println(intValue);
  } // printMethod3
}
