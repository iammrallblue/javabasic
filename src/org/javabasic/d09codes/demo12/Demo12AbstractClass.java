package org.javabasic.d09codes.demo12;

/*
  Key point:
    When the object of Subclass is executed.
    it would call superclass' constructor, and 
    subclass' constructor first before any methods invoked.
*/
public class Demo12AbstractClass {
  public static void main(String[] args) {
    Subclass sbc = new Subclass();
    sbc.eat();
  } // main
}
