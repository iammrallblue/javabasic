package org.javabasic.d03codes.practice;

public class Demo09ForLoop {
  /** examples. */
  public static void main(String[] args) {
    // printStars2();
    amountDeceasing();
  } // main

  /** example for deceasing numbers 100...95...90 ... 5. */
  private static void amountDeceasing() {
    for (int i = 100; i >= 5; i -= 5) {
      System.out.print(i + ", ");
    }
    // i -== 5, take numbers decreasing by 5 each loop.
  }

  /** print out ****** for 3 times. */
  public static void printStars2() {
    for (int i = 1; i <= 18; i++) {
      System.out.print("%");
      // if i % 6 == 0, go next line
      if (i % 3 == 0) {
        System.out.println();
      }
    }
  }

  /** print out ****** for 5 times. */
  public static void printStars() {
    // for loop to control number of times to print out ******
    for (int j = 1; j <= 5; j++) {

      // for loop to print out 6 start a line.
      for (int i = 1; i <= 6; i++) {
        System.out.print("*");
      }
      System.out.println(); // next line.
    }
  } // printStars

  /** all odd numbers from 1 - 30. */
  public static void oddNumber() {
    // 1st, print out all odd numbers from 1 - 30
    System.out.println("all odd numbers between 1 - 30: ");
    // NOTICE: i MUST be started with 1, NOT 0
    for (int i = 1; i <= 30; i += 2) {
      System.out.print(i + ", ");
    }
    System.out.println();

    // 2nd,
    for (int i = 30; i >= 1; i--) {
      if (i % 2 != 0) {
        System.out.print(i + ", "); // ******
      }
    }
    // this code is not equal to 2nd above.
    // for (int i = 1; i <= 30 && i % 2 != 0; i++) {
    // System.out.println(i); // 1
    // }
    // this snippet does not work.
  }
}
