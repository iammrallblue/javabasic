package org.javabasic.d04codes;

import java.util.Scanner;

/*
  Switch statement, input a number 1 - 7 to return a 
  corresponding day of week.
*/
public class Demo08SwitchMethod {
  /** example. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input a number: ");
    System.out.println(dayOfWeek(scanner.nextInt()));
    scanner.close();
  } // main

  /** input a number return day of week. */
  public static String dayOfWeek(int day) {
    if (day > 7 || day <= 0) {
      System.out.println("Please input number 1 ~ 7.");
    }
    switch (day) {
      case 1:
        return "Monday";
      case 2:
        return "Tuesday";
      case 3:
        return "Wednesday";
      case 4:
        return "Thursday";
      case 5:
        return "Friday";
      case 6:
        return "Saturday";
      case 7:
        return "Sunday";
      default:
        return "re-input.";
    }
  }

}
