package org.javabasic.d03codes.practice;

// import java.util.Scanner;

/*
  Instance:
    using If...else if ... else to determine the grade rank
    (A, B, C, D, Failure.)
*/
public class Demo05IfElseInstance {
  /** Demo of if else statement. */
  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Enter your grade (0 - 100):");
    // int grade = scanner.nextInt();
    // if (grade >= 95 && grade <= 100) {
    // System.out.println("Your grade is: A+");
    // } else if (grade >= 90 && grade < 95) {
    // System.out.println("Your grade is: A-");
    // } else if (grade >= 80 && grade < 90) {
    // System.out.println("Your grade is: B");
    // } else if (grade >= 70 && grade < 80) {
    // System.out.println("Your grade is: C");
    // } else if (grade >= 60 && grade < 70) {
    // System.out.println("Your grade is: D");
    // } else if (grade >= 0 && grade < 60) {
    // System.out.println("Your have a F");
    // } else {
    // System.out.println("Please Enter grade between 0-100");
    // }
    // scanner.close();

    int grade = 102;
    if (grade >= 90 && grade <= 100) {
      System.out.println("Grade is A");
    } else if (grade >= 80 && grade < 90) {
      System.out.println("Grade is B");
    } else if (grade >= 70 && grade < 80) {
      System.out.println("Grade is C");
    } else if (grade >= 60 && grade < 70) {
      System.out.println("Grade is D");
    } else if (grade >= 0 && grade < 60) {
      System.out.println("Failed.");
    } else {
      System.out.println("Score is exceeded. ");
    }
    // if score is higher 100, it will also
    // output a failed. therefore, failed statement
    // needs to redefine.
  } // main
}
