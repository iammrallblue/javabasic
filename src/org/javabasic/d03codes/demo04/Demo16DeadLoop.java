package org.javabasic.d03codes.demo04;

/*
  Dead loop: a loop will never stop by the condition.
    Standard Format:
      while(true) {
        // body of loop
      }
      why while, b/c the unknown number of times. 
      since condition is true forever, while loop will never stop.
      the codes after a dead while loop will never execute.

      dead for loop: aka infinity loop.
        1. 3 expressions can be ignored, but ; semicolon can't be ignored.
*/
public class Demo16DeadLoop {
  /** Demo of a dead loop. */
  public static void main(String[] args) {
    // while (true) {
    //   System.out.println("hit ctrl + c to stop me!");
    // }
    // while condition is always true, the loop will
    // not stop

    // for (int x = 1; x <= 10;) {
    // // for loop is missing the iteration
    // System.out.println("hello, bella" + x);
    // }
    // for loop is missing the iteration,
    // it will throw ERROR

    // 2nd dead loop
    for (;;) {
      System.out.println("ok"); // ok goes forever.
    }
  } // main
}
