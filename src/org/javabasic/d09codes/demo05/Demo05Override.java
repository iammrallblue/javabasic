package org.javabasic.d09codes.demo05;

/*
  Override:
    key point:
      1. @Override, MUST be presented.
      2. be sure method name in both Superclass and Subclass
          MUST same. and argument list MUST be same.
      3. the return value of Subclass method MUST be smaller
          or equal to the value of Superclass method.
      4. java.lang.Object is the root class of all classes.
          such as, java.lang.String is the Subclass of Object Class.
      5. modifier of Subclass method MUST greater or equal to 
          modifier of Superclass method.
          public > protected > (default) empty > private
*/
public class Demo05Override {
  /** Demo of override in Inheritance. */
  public static void main(String[] args) {
    Subclass sbc = new Subclass();
    sbc.method();
    sbc.superMethod();
  } // main
}
