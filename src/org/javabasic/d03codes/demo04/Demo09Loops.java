package org.javabasic.d03codes.demo04;

/*
  3. Iteration/Loop Structure: "for", "while", "do...while"
    When you know exactly how many times you want to loop through a block of code, 
    use the for loop instead of a while loop:
    1) for Loop:
      Format:
        for(initialization; condition; iteration) {
          loop body
        }
      a. initialization expression is executed ONLY once.
      b. the condition MUST be a boolean expression. 
          the loop is terminated when condition is false.
      c. the iteration expression is that increments or decrements the loop control variable. 
    2) while loop
      Format:
        while(condition) {
          // body of loop
          iteration expression;
        }
        a. condition can be any boolean expression.
        b. the body of loop will terminate when condition expression is false.
        c. the iteration expression is inside of the body of loop.
    3) do...while loop
      Format:
        do{
          // body of loop;
        }while (condition);
  
  Differences:
    1. If condition is never satisfied, for and while loop will execute ZERO time, 
    however, do/while will execute at least once. (see diffMethod())
    2. variable of for loop is defined inside of bracket, and they ONLY work inside of for loop.
        for (int i = 0; i < 10; i++) {
          i += i;
        }
        System.out.printlnn(i) // ERROR, can not use outside of the loop
  TIPS for choose for, while, and do/while:
      if the count is determined. should certainly use for loop.
      otherwise, use while loop. do/while is a last choice.
    
*/
public class Demo09Loops {
    /** Demo of Loops. */
    public static void main(String[] args) {
        // deceasing iteration by for loop statement
        for (int temp = 10; temp > 0; temp--) {
            System.out.println("tick: " + temp);
        }
        System.out.println("For Loop is Terminated.\n");

        // instance by using while loop statement
        int n = 10;
        while (n > 0) {
            System.out.println("touchdown: " + n);
            n--;
        }
        System.out.println("While loop is Terminated.\n");

        // instance by using do...while loop statement
        int m = 10;
        do {
            System.out.println("tick: " + m);
            m--;
        } while (m > 0);
        System.out.println("do/while loop is Terminated.\n");

        // call diffMethod() function
        diffMethod();
    } // main

    /** instance for differences. */
    public static void diffMethod() {
        for (int i = 1; i < 0; i++) {
            System.out.println("for loop is not executed, if did not see me.");
        }

        int i = 1;
        do {
            System.out.println("do/while is executed once, if you see me.");
            i++;
        } while (i < 0);
    }
}
