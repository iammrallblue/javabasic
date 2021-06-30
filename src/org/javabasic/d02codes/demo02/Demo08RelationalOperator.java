package org.javabasic.d02codes.demo02;

/*
  The Relational Operators
    Operators: Assume variable A holds 10 and B holds 20,
      == (equal to): 
        Checks if the values of two operands are equal or not, 
        if yes then condition becomes true.
        ex:
          (A == B) is not true. (10 =/= 20)
      != (not equal to):
        Checks if the values of two operands are equal or not, 
        if values are not equal then condition becomes true.
        ex:
          (A != B) is true.
      > (greater than):
        Checks if the value of left operand is greater than the value of right operand, 
        if yes then condition becomes true.
        ex:
          (A > B) is not true.
      < (less than):
        Checks if the value of left operand is less than the value of right operand, 
        if yes then condition becomes true.
        ex:
          (A < B) is true.
      >= (greater than or equal to):
        Checks if the value of left operand is greater than or equal to the value of right operand, 
        if yes then condition becomes true.
        ex:
          (A >= B) is not true.
      <= (less than or equal to):
        Checks if the value of left operand is less than or equal to the value of right operand, 
        if yes then condition becomes true.
        ex: 
          (A <= B) is true.
    NOTICE:
      1. results of The relational Operators are always boolean values. (true or false)
      2. Cannot write multiple expressions together, such as x < 1 < y

 */
public class Demo08RelationalOperator {
    /** . */
    public static void main(String[] args) {
        System.out.println(10 > 20); // false
        
        int x = 10;
        int y = 20;
        System.out.println(x < y); // true

        System.out.println(x >= 100); // false
        System.out.println(x <= 100); // true
        System.out.println(y <= 12); // false

        System.out.println(x == 10); // true
        // !=
        System.out.println(x != y); // true
        System.out.println(y != 20); // false
    } // main
}