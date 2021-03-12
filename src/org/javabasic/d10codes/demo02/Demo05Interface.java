package org.javabasic.d10codes.demo02;

/*
  Interface:
    Key point:
      1. interface can not have static code block.
            static {
            }
      2. interface can not have constructors, b/c interface cannot be instantiated.
      3. A Subclass can ONLY have one Superclass, 
          a Subclass can implement many interfaces at the s/t
          public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
          // override all abstract method from interfaces.
        }
      4. if Interfaces have the same name abstract methods, the implementation class ONLY need to 
          override one time the abstract method.
      5. If interface has default method, implementation class MUST override it.
      6. When Superclass method has name conflicted with interface's default method. 
          subclass will use method inheriting from Superclass.
*/
public class Demo05Interface {
  /** Demo of Interface. */
  public static void main(String[] args) {
    MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
    myInterfaceImpl.absMethod();

    // Subclass uses method from Superclass first when Superclass
    // and interface have method conflicted.
    Subclass sbc = new Subclass();
    sbc.method(); // method in Superclass.
  } // main
}
