package org.javabasic.d02codes;

import java.util.Scanner;

/*
  Find Characters in ASCII by an Integer.
*/
public class Demo17AsciiCharacter {
  /** Characters in ASCII. */
  public static void main(String[] args) {
    asciiCharacter();
  } // main

  /** Find Characters in ASCII table. */
  public static void asciiCharacter() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please input an Integer: ");
    int number = scanner.nextInt();
    System.out.println(number + " is Character in ASCII: " + (char) number);
    scanner.close();
  }
}
