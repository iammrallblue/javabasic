package org.javabasic.d03codes;

public class DemoIfStatement {
  /** If Statement. */
  public static void main(String[] args) {
    // 1st instance
    int heartBeats = 80;
    if (heartBeats < 60 || heartBeats > 100) {
      System.out.println("Heart Beat is NOT in normal range.");
    }
    System.out.println("program exit.");

    // 2nd instance
    int age = 60;
    if (age < 18) {
      System.out.println("Juvenile, still needs the guardian.");
    } else {
      System.out.println("You are an adult.");
    }

    // 3rd instance
    if (age <= 0) {
      System.out.println("improper age is defined.");
    } else if (age < 18) {
      System.out.println("you are adolescent.");
    } else if (age < 35) {
      System.out.println("you are young adult.");
    } else if (age < 65) {
      System.out.println("you are mid-aged.");
    } else if (age < 120) {
      System.out.println("you are senior citizen.");
    }

    // 4th instance
    double x = 12.4;
    double y = 42.1;
    double sum;
    if (x > 10 && y < 20) {
      sum = x + y;
      System.out.println("the sum of two double values:" + sum);
    } else {
      System.out.println("x is: " + x + " , y is: " + y);
    }

    System.out.println("The reminder of 4 / 2 is: " + 4 / 2);
    System.out.println("The module of 4 % 2 is: " + 4 % 2);
  } //
}
