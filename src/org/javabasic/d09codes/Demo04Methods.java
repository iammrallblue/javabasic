package org.javabasic.d09codes;

/*
  What if methods have the same name from Superclass and Subclass?
   for the same name method in the Superclass and Subclass, 
   if created object is Subclass, prefers to use the method from Subclass
   if created object is Superclass, prefers to use the method from Superclass.
*/
public class Demo04Methods {
  /** . */
  public static void main(String[] args) {
    ClassF cf = new ClassF();

    // object cf can call both methods from Superclass and Subclass
    cf.superMethod(); // method from Superclass
    cf.subMethod(); // method from Subclass.

    cf.method(); // prefer to use method in Subclass, b/c cf is object of Subclass ClassF.
  } // main
}
