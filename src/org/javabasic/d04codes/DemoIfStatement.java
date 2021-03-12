package org.javabasic.d04codes;

import java.util.Scanner;

/*
    gift depending on the score
*/
public class DemoIfStatement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = scanner.nextLine();
    System.out.println("Enter your score: ");
    int score = scanner.nextInt();
    if (score == 100) {
      System.out.println(name + " is got the prize, BMW");
    } else if (score > 80 && score <= 99) {
      System.out.println(name + " is got the prize, iPhone 12");
    } else if (score > 70 && score <= 79) {
      System.out.println(name + " is got the prize, iPad Pro 11");
    } else if (score > 60 && score <= 69) {
      System.out.println(name + " is got the prize, KFC free meal");
    } else {
      System.out.println(name + " is got nothing.");
    }
    scanner.close();
  } // main
}
