package org.javabasic.d02codes;

import java.util.Scanner;

public class Demo15Scanner {
  /** sum up two numbers. */
  public static void main(String[] args) {
    // require two numbers.
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please type first number:");
    int x = scanner.nextInt();
    System.out.print("Please type second number:");
    int y = scanner.nextInt();
    int sum = x + y;
    System.out.println(x + " + " + y + " = " + sum);

    scanner.close();
  } // main
}
