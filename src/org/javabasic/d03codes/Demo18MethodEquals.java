package org.javabasic.d03codes;

import java.util.Scanner;

/*
  "==" vs. Object.equals()
    1. String str == "bella", it compare the memory hashcode.
        not the value "bella".
    2. method equals() is compare the values of variables,
*/
public class Demo18MethodEquals {
  /** Contest Rank. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input your ranking: ");
    String str = scanner.next();
    // if (str == "1") {
    //   System.out.println("you have won 100K.");
    // } else if (str == "2") {
    //   System.out.println("you have won 50k.");
    // } else if (str == "3") {
    //   System.out.println("you have won 20k.");
    // } else {
    //   System.out.println("you can do better next time.");
    // }
    // // above code used "==" to compare both values, but it
    // // "==" ONLY can compare the memory hashcode.
    // // it always print out

    if ("1".equals(str)) {
      System.out.println("you have won 100k.");
    } else if ("2".equals(str)) {
      System.out.println("you have won 50k");
    } else if ("3".equals(str)) {
      System.out.println("you have won 20k.");
    } else {
      System.out.println("you can do better next time.");
    }
    scanner.close();
  } // main
}
