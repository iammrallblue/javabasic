package org.javabasic.d01codes.demo02;

/*
  JAVA VARIABLE SCOPE:
    Variables are only accessible inside the region they are created. This is called scope.
      Method SCOPE:
        Variables declared directly inside a method are available anywhere in 
        the method following the line of code in which they were declared.
          for example, public static void method() {
            int i = 10;
          }
          i = 20; // ERROR, CANNOT use outside of the method, 
                  //because i is declared inside of the method
      BLOCK SCOPE:
        A block of code refers to all of the code between between curly braces {}. 
        Variables declared inside blocks of code are only accessible by the code 
        between the curly braces which follows the line in which the variable was declared. 
        A block of code may exist on its own or it may belong to an if, while or for statement. 
        In the case of for statements, variables declared in the statement 
        itself are also available inside the block's scope.
          for example, for (int i = 0; i < 5; i++) {
            System.out.println(i);
          }
          System.out.println(i); // ERROR, out of the for loop block.
*/
public class Demo03VariableScope {
  public static void main(String[] args) {

  } // main

  /** Demo of method scope. */
  public static void method() {

    // Code here CANNOT use x

    int x = 100;

    // Code here can use x
    System.out.println(x);
  }

  // Code here CANNOT use x

  /** Demo of block scope. */
  public static void method2() {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

    } // The block ends here

    // Code here CANNOT use x
  }
}
