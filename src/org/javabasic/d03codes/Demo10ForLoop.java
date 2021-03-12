package org.javabasic.d03codes;

/*
  Notices for for-loop:
    1. 
      dead for loop: aka infinity loop.
        1. 3 expressions can be ignored, but ; semicolon can't be ignored.
        2. in for loop, expressions can be ignored. but the variable needs to be 
            declared before using
        3. condition expression is absented.
            dead loop. because the default condition is true. 
        4. iterating expression is absented.

*/
public class Demo10ForLoop {
  /** Notices of for-loop. */
  public static void main(String[] args) {
    // for (;;) {
    // System.out.println("ok"); // infinity ok
    // }

    // 2. initializing expression is absented.
    // int i = 1;
    // for (; i <= 5; i++) {
    // System.out.println("initializing expression is ignored.");
    // }

    // 3. condition expression is absented.
    // for (int i = 1;; i++) {
    // System.out.println(i + " dead loop."); // dead loop.
    // }

    // 4. iterating expression is absented.
    for (int i = 1; i <= 5;) {
      //i++;
      System.out.println(i); // 1, in dead loop
    }
  } // main
}
