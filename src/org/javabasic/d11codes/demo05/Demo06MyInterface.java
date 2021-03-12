package org.javabasic.d11codes.demo05;

/*
   If the implementation class of Interface ONLY needs to instantiate once, 
   or the Subclass of Superclass ONLY needs to instantiate ONCE.
   under this circumstance, we can apply anonymous inner class.

   Anonymous Inner Class:
   Format:
    Interface objectName = new Interface() {
      // Anonymous Inner Class.
      // override all abstract methods from interface.
    }
  Notice:
    
*/
public class Demo06MyInterface {

  /** . */
  public static void main(String[] args) {
    // polymorphism
    // MyInterfaceImpl impl = new MyInterfaceImpl();
    // MyInterface impl = new MyInterfaceImpl();
    // impl.absMethod();

    // using Anonymous Inner Class
    MyInterface object = new MyInterface() {
      @Override
      public void absMethod() {
        System.out.println("overrode abstract method in anonymous inner class.");
      }
    }; // {} is the anonymous inner class
    object.absMethod(); // ONLY use once.

    // using Anonymous Inner Class
    MyInterface object2 = new MyInterface() {
      @Override
      public void absMethod() {
        System.out.println("22222");
      }
    };
    object2.absMethod(); // ONLY use once.
  } // main
}