package org.javabasic.d02codes.demo02;

/*
  The Assignment Operators:
    1. Simple assignment operator: (=)
        int x = 30; or int result = x + y
    2. Complex assignment operators: (5 operators)
        Add AND assignment operator: (+=)
          It adds right operand to the left operand and assign the result to left operand.
          ex: 
            x += y, is equivalent to  x = x + y
        Subtract AND assignment operator: (-=)
          It subtracts right operand from the left operand and assign the result to left operand.
          ex:
            x -= y, is equivalent to x = x - y
        Multiply AND assignment operator: (*=)
          It multiplies right operand with the left operand and assign the result to left operand.
          ex:
            x *= y, is equivalent to x = x * y
        Divide AND assignment operator: (/=)
          It divides left operand with the right operand and assign the result to left operand.
          ex:
            x /= y, is equivalent to x = x / y
        Modulus AND assignment operator: (%=)
          It takes modulus using two operands and assign the result to left operand.
          ex:
            x %= y, is equivalent to x = x % y
*/
public class Demo07AssignmentOperator {
  /** Demo of Assignment Operators. */
  public static void main(String[] args) {
    int a = 10;
    a += 5; // a = a + 5
    System.out.println(a); // 15

    int x = 10;
    x %= 3; // x = x % 3
    System.out.println(x); // modulus is 1;

    // 50 = 30; // ERROR, Constant cannot be variable;

    byte var = 30;
    // noticeably, 30 is int, 5 is int as well
    var += 5; 
    // a few steps to convert byte and int,
    // var = var + 5;  var = byte + int
    // var = int + int (convert byte here)
    // var = int
    // var = (byte) int // explicit conversion
    System.out.println(var); // 35, var is byte.

  } // main
}