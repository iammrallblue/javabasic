package org.javabasic.d03codes.demo02;

/*
  Else if statement:
    Format:
      if (condition_1) {
        // code
      } else if (condition_2) {
        // code
      } else if (condition_n) {
        // code
      } else {

      }
    else if statement:
      to specify a new condition, if the first condition is false
      and condition_2 is true.
*/
public class Demo04ElseIfStatement {
  /** Demo of Else-if statement. */
  public static void main(String[] args) {
    int x = -200;
    int y;
    if (x >= 3) {
      y = 2 * x + 1;
    } else if (x > -1 && x < 3) { 
      y = 3 * x;
    } else {
      y = 2 * x - 1;
    }
    System.out.println("The result is: " + y);
  } // main
}
