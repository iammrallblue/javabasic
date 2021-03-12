package org.javabasic.d11codes.demo04;

/*
  Local Class:
    define a local class inside any block (see Expressions, Statements, 
    and Blocks for more information). For example, 
    you can define a local class in a method body, a for loop, or an if clause.
    cannot use local class outside of method body, for loop of if statement

  Format:
    public class OuterClass {
      public static void outerMethod(argument list) {
        // local class
        class LocalClass (no public modifier)
      }
    }
  NOTICE:
    if local class needs to access the local variable of the outer method
    the local variable MUST be the constant even if keyword final does
    not appear.
*/
public class OuterClass {

  /** Instance Method has Local class inside method body. */
  public void outerMethod() {
    // local variable (MUST be constant)
    int number = 100;
    System.out.println(number); //

    // local class
    class LocalClass {
      int number = 10; 

      public void localMethod() {
        System.out.println(number);
      } // local method
    } // local class
    
    // directly create an object of local class inside of the outer method.
    LocalClass loClass = new LocalClass();
    loClass.localMethod();
  } // outer method
}
