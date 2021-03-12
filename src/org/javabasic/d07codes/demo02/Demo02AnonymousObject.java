package org.javabasic.d07codes.demo02;

import java.util.Scanner;

/*
  Anonymous Object of Scanner used as method parameter:

*/
public class Demo02AnonymousObject {
  /** Demo of Anonymous Object as a parameter in method. */
  public static void main(String[] args) {
    // normal creates object of Scanner Class.
    // Scanner scanner = new Scanner(System.in);
    // invoke methodParam() to transfer parameter

    // 1st, using an Anonymous object of Scanner
    // int number = new Scanner(System.in).nextInt();
    // System.out.println("the value is: " + number);

    // 2nc, using an Anonymous object of Scanner as a passing parameter
    methodParam(new Scanner(System.in));

    // call returnMethod()
    Scanner scanner = returnMethod();
    int number = scanner.nextInt();
    System.out.println("the value is: " + number);
  } // main

  /** Demo of Anonymous object of Scanner as a parameter. */
  public static void methodParam(Scanner input) {
    // normal using Scanner Class
    // Scanner scanner = new Scanner(System.in);
    int var = input.nextInt();
    System.out.println("the number is: " + var);
    // scanner.close();
  }

  /** Demo of Anonymous object as return value. */
  public static Scanner returnMethod() {
    // normal create object of Scanner for return.
    // Scanner scan ner = new Scanner(System.in);
    // return scanner;

    // Using Anonymous object as a return value.
    return new Scanner(System.in);
  }
}
