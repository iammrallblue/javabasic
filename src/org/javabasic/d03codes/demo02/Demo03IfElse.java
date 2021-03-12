package org.javabasic.d03codes.demo02;

/*
  If...Else Statement
    format:
      if (condition) {
        // a block of code
      } else {
        // a block of code.
      }

    else statement:
      else statement specifies a block of {code} to be executed
      if condition if false.

    example:
      to determine a number is EVEN or ODD
        if true, number % 2 == 0, is EVEN
        if false, execute else statement.
  
*/
public class Demo03IfElse {
  /** Demo of if-else statement. */
  public static void main(String[] args) {
    int number = 9;
    if (number % 2 == 0) {
      System.out.println("the number " + number + " is EVEN.");
    } else {
      System.out.println("the number " + number + " is ODD.");
    }
  } //
}
