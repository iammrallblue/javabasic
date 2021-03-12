package org.javabasic.d04codes;

public class DemoIfElseEx {
  public static void main(String[] args) {
    int x = 4;
    int y = 1;
    if (x > 2) {
      if (y > 2) {
        System.out.println(x + y);
      }
      System.out.println("Bella"); // result: Bella
    } else {
      System.out.println("x is: " + x);
    }

    // 2
    boolean b = true;
    if ( b == false) {
      System.out.println("a");
    } else if (b) {
      System.out.println("b"); // result: b
    } else if(!b) {
      System.out.println("c");
    } else {
      System.out.println("d");
    }
  } // main
}