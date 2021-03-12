package org.javabasic.d07codes.demo01;

import java.util.Scanner;

/*
  Instance:
    to get three int values from keyboard, then find out the max value.
  Steps:
    1. first to get the max value of first two numbers then assign to variable max.
    2. second to get the max value between max and third number.
    
*/
public class Demo03Max {
  /** Demo of the max value. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Compare and find the max number between 3 numbers:");
    System.out.println("First number:");
    int num1 = scanner.nextInt();
    System.out.println("Second number:");
    int num2 = scanner.nextInt();
    System.out.println("Third number:");
    int num3 = scanner.nextInt();

    // method 1
    System.out.println("Using Ternary operator to find the max value.");
    int temp = num1 > num2 ? num1 : num2;
    int max = temp > num3 ? temp : num3;
    System.out.println(num1 + ", " + num2 + ", and " + num3);
    System.out.println("the max value is: " + max);

    // method 2
    System.out.println("Using if...else if statement to find the max value.");
    if (num1 > num2 && num1 > num3) {
      System.out.println("the max value is: " + num1);
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("the max value is: " + num2);
    } else {
      System.out.println("the max value is: " + num3);
    }

    // method 3
    System.out.println("Using nested if statement to find the max value.");
    if (num1 > num2) {
      if (num1 > num3) {
        System.out.println("the max value is: " + num1);
      } else {
        System.out.println("the max value is: " + num3);
      }
    } else {
      if (num2 > num1) {
        if (num2 > num3) {
          System.out.println("the max value is: " + num2);
        } else {
          System.out.println("the max value is: " + num3);
        }
      }
    }
    scanner.close();
  } // main
} // DemoScannerMax
