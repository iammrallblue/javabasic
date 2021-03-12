package org.javabasic.d10codes.demo01;

/*
  in Java 8:
    Interface:
      declare static method in Interface.
    Format:
      public static void staticMethod(argument list) {
        // body of static method
      }
    Key point:
      1. no default and abstract, and static method has body.
      2. when an interface does not have any abstract methods
          then implementation classes don't need to override
          any abstract method (see MyInterfaceStaticImpl.java)
*/
public interface MyInterfaceStatic {
  // static method
  public static void staticMethod() {
    System.out.println("A static method in Interface.");
  }
}
