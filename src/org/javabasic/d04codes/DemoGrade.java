package org.javabasic.d04codes;

import java.util.Scanner;

/*
    Using If-Statement and Class Scanner
*/
public class DemoGrade {
  /** grade. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your grade: ");
    int grade = scanner.nextInt();
    ;
    if (grade == 100) {
      System.out.println("The prize is BMW.");
    } else if (grade > 80 && grade <= 99) {
      System.out.println("The prize is iPad Pro 12.9 2020 version");
    } else if (grade >= 60 && grade <= 80) {
      System.out.println("the prize is iPhone Max");
    } else {
      System.out.println("you've got nothing to prize.");
    }
    scanner.close();
  } // main
}
