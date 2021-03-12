package org.javabasic.d10codes.demo01;

/*
  in Java 9/9+:
    1. Instance variables are constants in Interface. even if "public static final" 
      did not appear, variables are still constant.
        Constants MUST be assigned when declared. and the value CANNOT be changed.
        name of constants MUST be capitalized.

    2. Abstract method:
      public abstract void absMethod();
        ** all implementation classes need to override abstract methods from interface.
          except implementation classes are abstract class.
    
    3. Since Java8, Interface can declare default method.
      public default void defaultMethod() {
        // body of default method
      }
        default method can be overridden.

    4. Since Java8, Interface can declare static method.
      public static void staticMethod() {
        // body of static method.
      }
        ** static method does not relate to the object of implementation class,
        directly call the static method by the name of interface.
    
    5. Since Java9, Interface can declare private static method
      normal private method : private void privateMethod() {}
      static private method in interface: private static void staticPrivateMethod() {}
      ** private static method ONLY can call by interface itself. the implementation
      class CANNOT call the static private method.
*/
public class Demo04InterfaceSummary {
  
}
