package org.javabasic.d17codes;

/*
  Example of Lambda Expression:
    1. declare an interface Cook, contains an abstract method cooking,
        the method doesn't have args and return value.
    2. using Lambda to call the method of interface Cook, print out
        food is for serve.
*/
public class Demo09CookByLambda {
  /** . */
  public static void main(String[] args) {
    // 1
    // call invokeCookMethod, arg is interface Cook
    // have to use Cook's anonymous inner class
    invokeCookMethod(new Cook() {

      @Override
      public void cooking() {
        System.out.println("Food is ready to serve.");
      }
    });
    // 2 lambda expression to simply above code
    invokeCookMethod(() -> {
      System.out.println("Food is ready to serve by Lambda.");
    });

    // 3 optimized lambda expression.
    invokeCookMethod(() -> System.out.println("food is ready."));
  } // main

  // a method for passing interface Cook,
  // call method of interface Cook inside of the body of this method.
  public static void invokeCookMethod(Cook cook) {
    cook.cooking();
  }
}
