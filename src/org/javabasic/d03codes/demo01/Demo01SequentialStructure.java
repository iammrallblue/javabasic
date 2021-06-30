package org.javabasic.d03codes.demo01;

/*
  Processing Controls (3 ways)
    1. Sequential Structure:
        The sequence structure is built into Java. Unless directed otherwise, 
        the computer executes Java statements one after the other in the order 
        in which they’re written—that is, in sequence. 
          the instance will print out the result 1 2 3,
          which is following one after the other in the order.
    2. Selection Structure:
        1) If-Statement, see Demo 03,04,05, 06
        2) Switch Statement
      see Demo02IfStatement.java
    
    3. Iteration/Loop Structure:
       1) for Loop:
        for(initialization; condition; iteration) {
           loop body
        }
          a. initialization expression is executed ONLY once.
          b. the condition MUST be a boolean expression. 
          the loop is terminated when condition is false.
          c. the iteration expression is that increments or decrements the loop control variable. 
       2) while loop
       3) do...while loop
*/
public class Demo01SequentialStructure {
    /** Demo of Sequential Structure. */
    public static void main(String[] args) {

        // Sequential Structure from top to bottom of main method scope.
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    } // main
}