package org.javabasic.d09codes.demo03;

/*
  Local variable, instance variable in Superclass,
  and instance variable in Subclass.
  Key point:
    access same name local variable, and instance variable
    1. Local variable, access it directly
    2. field in Subclass, access it by using keyword "this"
        format:
          this.num;
    3. field in Superclass, access it by using keyword "super"
        format:
          super.num;
*/
public class Demo03SameNameVariable {
  public static void main(String[] args) {
    Subclass sbc = new Subclass();
    sbc.subMethod();
  } // main
}
