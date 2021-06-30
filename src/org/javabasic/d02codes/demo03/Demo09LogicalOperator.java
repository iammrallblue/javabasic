package org.javabasic.d02codes.demo03;

/*
  The Logical Operators:
    && (logical and) Called Logical AND operator
      If both the operands are non-zero, then the condition becomes true.
      boolean A = true, B = false;
      ex:
        (A && B) is false
    || (logical or) Called Logical OR Operator
      If any of the two operands are non-zero, then the condition becomes true.
      ex:
        (A || B) is true
    ! (logical not) Called Logical NOT Operator
      Use to reverses the logical state of its operand. 
      If a condition is true then Logical NOT operator will make false.
      ex:
        !(A && B) is true
    NOTICE:
      1. Logical Operator is ONLY for boolean values (true and false)
      2. Logical AND and OR MUST have 2 boolean expressions (true or false), 
          but Logical NOT can have one expression.
      two conditions:
        conditionA && conditionB
      multiple conditions:
        conditionA && conditionB && conditionC ...
    TIPS:
      For 1 < x < 3, it should split into 2 parts.
      int x = 2;
      x > 1 && x < 3;
*/
public class Demo09LogicalOperator {
    /** Demo of Logical Operators. */
    public static void main(String[] args) {
        // int m = 2;
        // int n = 3;
        // System.out.println(m > n && n < m); // false

        System.out.println(3 < 4 && 10 > 8); // true

        //
        // System.out.println(! (m != n)); // false

        int x = 10;
        // false && ... (skipped ... if first statement is false)
        // System.out.println(3 > 4 && ++x < 100); // false && ...
        System.out.println(x + " did not change."); // 10, b/c ++x < 100 is skipped.

        int y = 20;
        // true || ... (skipped ... if first statement is true)
        // System.out.println(3 < 4 || ++y < n); // true || ...
        System.out.println(y);
    } // main
}