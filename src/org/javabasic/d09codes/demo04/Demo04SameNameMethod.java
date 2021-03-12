package org.javabasic.d09codes.demo04;

/*
  In inheritance, to access same name methods:
  
  Key point:
    access same name method from different location.
    Override method in Inheritance:
      Override:
        same method name, same argument list.
        with keyword "@Override"
  Issue Description:
    when Superclass and Subclass have same name method,
    created object of Subclass, which method the object of 
    Subclass will access first?
      call method() from Subclass itself first.
      because, the object is created from Subclass.
*/
public class Demo04SameNameMethod {
  /** methods. */
  public static void main(String[] args) {
    Subclass sbc = new Subclass();

    // method subMethod() from Subclass itself
    sbc.subMethod();
    // method superMethod() from Superclass
    sbc.superMethod();

    // same name method in both class
    sbc.method(); // call method() from Subclass itself
  } // main
}
