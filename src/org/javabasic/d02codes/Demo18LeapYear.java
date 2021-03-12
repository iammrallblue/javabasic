package org.javabasic.d02codes;

import java.util.Scanner;

public class Demo18LeapYear {
  public static void main(String[] args) {
    leapYear();
  } // main

  /**
   * Find the year can divide by 4, but not divide by 100 or ONLY divide by 400.
   */
  public static void leapYear() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a year: ");
    int year = scanner.nextInt();
    // 1. ternary for determining leap year.
    // String isLeapYear;
    // isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "Leap
    // Year" : "Normal Year";
    // System.out.println(year + " is a " + isLeapYear);

    scanner.close();

    // 2. if-statement, divide by 4 and module by 100 !=0 is in same pa
    // if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    // System.out.println(year + " is a leap year.");
    // } else {
    // System.out.println(year + " is a normal year.");
    // }

    // 3. if-statement
    if (year % 4 == 0 && year % 100 != 0) {
      if (year % 400 == 0) {
        System.out.println(year + " is a leap year.");
      }
    } else {
      System.out.println(year + " is a normal year.");
    }
  }
}
