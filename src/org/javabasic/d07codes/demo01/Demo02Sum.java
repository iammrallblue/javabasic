package org.javabasic.d07codes.demo01;

import java.util.Scanner;

/*
  Instance:
    to get two int values from keyboard by Scanner, then sum up two values.
*/
public class Demo02Sum {
  /** Demo of summation of values from Scanner input. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int intA = scanner.nextInt();
    System.out.println("Enter second number: ");
    int intB = scanner.nextInt();

    int sum = intA + intB;
    System.out.println(intA + " + " + intB + " = " + sum);

    scanner.close();
  }
}