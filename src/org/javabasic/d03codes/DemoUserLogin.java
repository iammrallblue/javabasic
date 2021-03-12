package org.javabasic.d03codes;

import java.util.Scanner;

/*
  checking user name and password,
  users have 5 times to check user name and password
*/
public class DemoUserLogin {
  /** . */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // users have 5 times to login.
    for (int i = 1; i <= 5; i++) {
      System.out.print("Input your user ID: ");
      String userName = scanner.next();
      System.out.print("Input your password:");
      String password = scanner.next();
      // determine if user id and password are correct.
      if ("admin".equals(userName) && "999".equals(password)) {
        System.out.println("Login Successful.");
        break; // if both correct, exit login loop
      } else {
        if (i == 5) {
          System.out.println("account is locked. try again 10 minutes later.");
        } else {
          System.out.println("User ID or Password is wrong.");
          System.out.println((5 - i) + " attempts remained!!");
        }

      }
    }
    scanner.close();
  } // main
}
