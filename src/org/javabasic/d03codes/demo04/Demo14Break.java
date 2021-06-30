package org.javabasic.d03codes.demo04;

/*
  Jump Statements:
    keyword: break
      it can be used to "jump out" of a switch statement.
      can also be used to jump out of a loop.
      Common Usage:
        1. in the switch statement, when break is executed, 
        the whole switch statement is terminated.
        2. in the loop statement, when break is executed, the whole loop statement is terminated.
        3. When used inside a set of nested loops, 
        the break statement will only break out of the innermost loop. 
          (see below codes)
    keyword: continue (see Demo15Continue.java)
      it can continue the loop, but stop processing the remainder of the code in its
      body for this particular iteration.
      instance:
        skipping number 4

    Comparison:
      break is stop the whole loop
      continue is stop current processing, continue to finish the loop.
*/
public class Demo14Break {
    /** . */
    public static void main(String[] args) {

        // break out of a loop
        for (int i = 1; i <= 20; i++) {
            // stop at 4 by break, exit loop
            if (i == 4) {
                break;
                // continue; // skip 4
            }
            System.out.println(i);
        }
        System.out.println("for loop complete.");

        // break in while loop
        int num = 0;
        while (num < 100) {
            if (num == 10) {
                break;
            }
            System.out.println(num);
            num++;
        }
        System.out.println("while loop complete.");

        // break in a nested for loop
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break;
                } // if
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("for loop complete.");
    } // main
}
