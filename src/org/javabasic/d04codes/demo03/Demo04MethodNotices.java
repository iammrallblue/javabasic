package org.javabasic.d04codes.demo03;

/*
  NOTICE:
    1. Methods define inside of Class, or Interface,
      a method cannot define inside of another method.
    2. method orders can be unordered.
    3. Methods cannot execute by themselves, it needs to be invoked.
      *** in the same class, directly call a static void method by its name
          ( see method())
      *** methods with return value can use three ways to invoke
          1. invoking directly by method name;
          2. invoking by print
          3. invoking by assigning return value to a new variable.
    4. If a method has a return value, the keyword return MUST be presented.
    5. the type of return value MUST be same with the method type.
        public int method() {
          // body of method
          return int_type;
        }
    6. a void method does not have a return value, but it can have a keyword return
        public static void method() {
          //body of method
          return; (this return means the end of method execution.)
        }
    7. the last return in a void method can be ignored.
    8. a method can have many return, but ONLY need one to be executed.
        (see getMax())
        *** can have many returns, but cannot write two or more returns together.
            return a;
            return b; // ERROR.
*/
public class Demo04MethodNotices {
  /** Demo of method notices. */
  public static void main(String[] args) {

    // to call a static void method()
    method();

    // to call a static int method()
    int result = method2(1, 2);
    System.out.println(result);

    // to call a static int method3() with many returns
    int max = getMax(3, 4);
    System.out.println("the max value is: " + max);
  } //

  public static void method() {
    System.out.println("this is a static void method.");
  }

  /** an int method with return value. */
  public static int method2(int x, int y) {
    System.out.println("this is a static int method.");
    int result = x + y;
    return result;
  }

  /** a method with many returns. */
  public static int getMax(int x, int y) {
    if (x > y) {
      return x;
    } else {
      return y;
    }
  }
}
