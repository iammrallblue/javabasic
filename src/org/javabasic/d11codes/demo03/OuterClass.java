package org.javabasic.d11codes.demo03;

public class OuterClass {
  // outer class variable
  int number = 10;

  public class InnerClass {
    // inner class variable
    int number = 20;

    /** Inner Class inside of Outer class. */
    public void innerMethod() {
      // local variable
      int number = 30;

      // call local variable
      System.out.println(number); // 30
      // call inner class variable.
      System.out.println(this.number); // 20
      // call outer class variable
      int var = OuterClass.this.number;
      System.out.println(var);
    }
  }
}
