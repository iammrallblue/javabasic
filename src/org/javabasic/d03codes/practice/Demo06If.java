package org.javabasic.d03codes.practice;

import java.util.Scanner;

/*
  Determine an Age:
*/
public class Demo06If {
  /** determine an age. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input an age number: ");
    int age = scanner.nextInt();
    if (age >= 0 && age <= 6) {
      System.out.println("0~6 is childhood. ");
    } else if (age >= 7 && age <= 17) {
      System.out.println("7~17 is boyhood.");
    } else if (age >= 18 && age <= 40) {
      System.out.println("18~40 is youth.");
    } else if (age >= 41 && age <= 65) {
      System.out.println("41~65 is middle age.");
    } else if (age >= 66 && age <= 130) {
      System.out.println("66~130 is old age.");
    } else {
      System.out.println("you're something else.");
    }
    scanner.close();
  } // main
}
