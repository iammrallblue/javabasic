package org.javabasic.d10codes.demo01;

/*
  A private method in Interface:
    Format:
      private return_value privateMethodName() {

      }
  A static private method in Interface:
    Format:
      public static return_value privateStaticMethodName() {

      }
    Key point:
      1. A common method is used by all default methods
      2. A common method should be ONLY for default method
          inside of Interface, not for implementation class.
      3. A common method should be in private.
    issue description:
      when default methods have common code, take out
      all common code and declare a common method for 
      all default methods. but all implementation classes
      also can access the common method b/c it is modified 
      as a public method.
      Solution: (see below codes)
        In Java 9, Interface has new features 
                    private method()
          define common method as a private, ONLY using by
          default methods inside of Interface.
*/
public interface MyInterfacePrivate {
  /** A default method in Interface. */
  public default void defaultMethodA() {
    System.out.println("default method A.");
    // System.out.println("Bella");
    // System.out.println("Abby");
    // System.out.println("Cathy");
    // commonMethod(); // call common method
  }

  /** default method in Interface. */
  public default void defaultMethodB() {
    System.out.println("default method B.");
    // System.out.println("Bella");
    // System.out.println("Abby");
    // System.out.println("Cathy");
    // commonMethod();
  }

  // /** get common code from all default methods. */
  // private void commonMethod() {
  // System.out.println("Bella");
  // System.out.println("Abby");
  // System.out.println("Cathy");
  // }
}
