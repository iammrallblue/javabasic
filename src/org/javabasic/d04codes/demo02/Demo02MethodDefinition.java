package org.javabasic.d04codes.demo02;

/*
  A method is a program module that contains a series of statements that carry out a task.
  Format:
    public int methodName(argument list) {
      // body of method
      return intValue;
    }
    public static void methodNName() {

    }
    methodName() is the name of the method
    static means the method belongs to the MyClass class 
    and not belongs to an object of the MyClass class. 
    void means that this method does not have a return value. 
      
    For using a method, it should be called. There are two ways in which a method is called 
    i.e., method returns a value or returning nothing (no return value).
*/
public class Demo02MethodDefinition {
  /** definition of method. */
  public static void main(String[] args) {
    // calling sumMethod, and assign the return value to result variable.
    int result = sumMethod(2, 3); // result == 5.
    result += 100; // 5 + 100
    System.out.println("the return value after plus 100 is: " + result); // 105
  } // main

  public static int sumMethod(int x, int y) {
    int sum = x + y;
    return sum; // return 5.
  }
}
