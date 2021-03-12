package org.javabasic.d11codes.demo01;

/*
  A Subclass inherited from Superclass (ClassA)
*/
public class Subclass extends Superclass {
  @Override
  public void superMethod() {
    System.out.println("overrode method of Superclass in Subclass (ClassB)");
  }

  // ERROR, Cannot override the final method from ClassA
  // @Override
  // public void method() {
  //   System.out.println("Overrode the final method in Subclass.");
  // }
}
