package org.javabasic.d03codes.practice;

import java.util.Scanner;

/*
  Switch Statement example
    NOTICE:
      in the example, cases can combine, if they have same 
      codes, it made code more brief and clear.
*/
public class Demo07Switch {
  /** example of switch statement. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Check week's task: (1-7)");
    int weekday = scanner.nextInt();
    switch (weekday) {
      case 1:
      case 2:
      case 4:
      case 6:
        System.out.println("need studying.");
        break;
      case 3:
      case 5:
        System.out.println("need reviewing.");
        break;
      case 7:
        System.out.println("need having fun on the weekend.");
        break;
      default :
        System.out.println("do whatever you wanna.");
        break;
    }
    scanner.close();
  } // main
}
