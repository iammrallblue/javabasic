package org.javabasic.d02codes;

import java.util.Scanner;

/*
  determine a char whether a number, upper case, or lower case.
*/
public class Demo19Characters {
  /** determine a character. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a Character:");
    String str = scanner.next();
    char ch = str.charAt(0);
    // 1. ternary operator
    // String result = ch >= '0' && ch <= '9' ? "Number" : ch >= 'A' && ch <= 'Z' ?
    // "Upper Case" : "Lower Case";
    // System.out.println(ch + " is: " + result);

    // 2. if-statement
    if (ch >= '0' && ch <= '9') {
      System.out.println(ch + " is a number.");
    } else if (ch >= 'A' && ch <= 'Z') {
      System.out.println(ch + " is a uppercase letter.");
    } else if (ch >= 'a' && ch <= 'z') {
      System.out.println(ch + " is a lowercase letter.");
    } else {
      System.out.println("Program is ONLY can recognize letters and numbers.");
    }
    scanner.close();
  } // main
}
