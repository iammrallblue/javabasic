package org.javabasic.d02codes.demo03;

/*
  Conditional Operator aka ternary operator (?:)
    Conditional operator is also known as the ternary operator. 
    This operator consists of three operands and is used to evaluate Boolean expressions. 
    The goal of the operator is to decide, which value should be assigned to the variable. 

    Format:
      variable x = (expression) ? value1 if true : value2 if false
      Datatype varName = (condition) ? expressionA : expressionB

    Procedures:
       The ternary operator consists of a condition that evaluates to either true or false, 
       plus a value that is returned if the condition is true and 
       another value that is returned if the condition is false.
    example of ternary operator:
      find max value of two numbers:
*/
public class Demo10TernaryOperator {
  /** example for finding the max value. */
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    // find the max value of x and y
    int max = x > y ? x : y;
    System.out.println("The max value is: " + max);
  } // main
}