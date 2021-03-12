package org.javabasic.d11codes.demo01;

/*
  1. Final Class:
      A final class can be instantiated, but not inherited. (see FinalClass)
      Format:
        public final class className {
          // body of class
        }
      A final class CANNOT instantiate by any other classes.
      therefore, methods of a final class CANNOT be overridden.
        ** no class or implementation class can inherit it.
    
  2. Final Method:
      A final method can be called, but cannot be overridden. (see Superclass and Subclass)
      When a method is declared as a final method, that method is final, cannot be changed.
      Format:
        public final void finalMethod(){
          // body of final method.
        }
  3. Final Local Variable:
      Once a final local variable is used. the variable cannot be changed.
    NOTICE:
        for class and method, keyword abstract and final
         cannot be used at the same time. (see below.)
  4. Final Instance Variable:  (see Person)
      Once a final instance variable is used. the instance variable cannot be changed.
      ** b/c of the default value, the instance variable MUST assign a value when it is declared.
      there will be no default value, if assigned a value.
      
*/
public class Demo01Final {
  /** . */
  public static void main(String[] args) {
    // Final Class
    FinalClass finalClass = new FinalClass();
    finalClass.method();

    // Final Method
    Superclass cb = new Subclass();
    cb.superMethod(); // call overrode method in Subclass.
    cb.method(); // call final method in Superclass.

    // Final Local Variable
    int num = 10;
    System.out.println(num); // 10

    // final int number = 300;
    final int number;
    number = 200;
    System.out.println(number);
    // number = 45; // ERROR.
    // The final local variable number cannot be assigned.
    // It must be blank and not using a compound assignment
  } // main

  // abstract and final, ERROR,
  // public abstract final void methodA() {
  // System.out.println(ab);
  // }
}
