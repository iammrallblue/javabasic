package org.javabasic.d03codes;

import java.util.Scanner;

/*
  Input some integers, sum up integers,
  util input 0 to end it.
  ** some integers means do not have specified 
      number of loops. therefore, using while loop
      or do..while loop.
  keyword continue:
    1. when continue in a loop statement, it means
        ending current loop, going to next loop.
    2. continue is ONLY using inside of loop statement
*/
public class Demo11Loop {
  /** example. */
  public static void main(String[] args) {
    // sumIntegers();
    // countGrade();
    // calcFactorial();
    countNumbers2();
  } // main

  /** determine number of positive and negative, then sum up. */
  public static void countNumbers() {
    Scanner scanner = new Scanner(System.in);
    // collect positive numbers
    int posNumber = 0;
    // collect negative number
    int negNumber = 0;
    // sum up positive and negative numbers
    int sum = 0;
    // receive input numbers
    int num;

    do {
      System.out.println("Input a number: ");
      num = scanner.nextInt();
      if (num > 0) {
        posNumber++;
      } else if (num < 0) {
        negNumber++;
      } else {
        break; // in here, when 0 is input, program is terminated.
      }
      sum += num;
    } while (true);

    System.out.println(posNumber + " positive numbers.");
    System.out.println(negNumber + " negative numbers.");
    System.out.println("sum of positive and negative numbers is: " + sum);
    scanner.close();
  }

  /** 2nd method, w/o break in if-statement. */
  public static void countNumbers2() {
    // 2. w/o a break in if-statement
    Scanner scanner = new Scanner(System.in);
    // collect positive numbers
    int posNumber = 0;
    // collect negative number
    int negNumber = 0;
    // sum up positive and negative numbers
    int sum = 0;
    // receive input numbers
    int num;

    do {
      System.out.println("Input a number: ");
      num = scanner.nextInt();
      if (num > 0) {
        posNumber++;
      } else if (num < 0) {
        negNumber++;
      }
      sum += num;
    } while (num != 0);

    System.out.println(posNumber + " positive numbers.");
    System.out.println(negNumber + " negative numbers.");
    System.out.println("sum of positive and negative numbers is: " + sum);
    scanner.close();
  }

  /** calculate the factorial of a number. */
  public static void calcFactorial() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("input a number: ");
    int number = scanner.nextInt();
    int factor = 1; // factor cannot be zero,

    // 1.
    // if (number == 0) {
    // factor = 1;
    // } else {
    // for (int i = number; i > 0; i--) {
    // factor *= i;
    // }
    // }
    // System.out.println(number + "! is: " + factor);

    // 2.
    // for (int i = number; i > 0; i--) {
    // factor *= i;
    // }
    // System.out.println(number + "! is: " + factor);

    // 3.
    // determine neg. number
    if (number < 0) {
      System.out.println("input number is negative.");
    } else {
      for (int i = number; i > 0; i--) {
        factor *= i;
      }
      System.out.println(number + "! is: " + factor);
    }
    scanner.close();
  }

  /** count grades above 90. */
  public static void countGrade() {
    Scanner scanner = new Scanner(System.in);
    // variable count is for score above 90
    int count = 0;
    for (int i = 1; i <= 5; i++) {
      System.out.println("input a score: ");
      int score = scanner.nextInt();
      // determine if score is above 90.
      if (score <= 90) {
        continue; // ends the current loop, go next step.
      }
      count++;
    }
    System.out.println(count + " students had score above 90.");
    scanner.close();
  }

  /** sum up some integers by do...while loop. */
  public static void sumIntegers() {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    do {
      System.out.println("Input an integer: ");
      int number = scanner.nextInt();
      sum += number; // sum = sum + number
      if (number == 0) {
        break;
      }
    } while (true);

    // print sum
    System.out.println("total is; " + sum);
    scanner.close();
  }
}
