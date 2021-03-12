package org.javabasic.d09codes;

/*
  A Subclass inherited from Superclass ClassG
*/
public class ClassH extends ClassG {
  
  @Override
  public void method() {
    System.out.println("method is overridden in Subclass.");
  }
  
  // @Override
  // private void method() {} // ERROR, access modifier is smaller than the Superclass'
}
