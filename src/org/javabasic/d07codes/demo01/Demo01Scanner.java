package org.javabasic.d07codes.demo01;

import java.util.Scanner; // 1. import package

/*
  java.util.Scanner:
    Scanner Class: (reference data type)
      allows to get input from keyboard etc.
      public class Scanner extends Object {
        
      }

  Usage of a Class from API:
    1. import package
        some packages don't need to import
          such as, java.lang package.

    2. Create object of class
        Class class = new Class();
        Scanner scanner = new Scanner(System.in);

    3. using the methods from Scanner Class.
        scanner.nextInt()
        scanner.next();
*/
public class Demo01Scanner {
  /** Demo of Scanner Class. */
  public static void main(String[] args) {

    // 2. instantiated an object of Class Scanner.
    // System.in means from Keyboard
    Scanner scanner = new Scanner(System.in);

    // to get input from the Keyboard, get an int value
    int var = scanner.nextInt();
    System.out.println("The number is: " + var);

    // get a String value
    String str = scanner.next();
    System.out.println("The String value is: " + str);

    scanner.close();
  }
}