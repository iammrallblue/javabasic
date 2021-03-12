package org.javabasic.d08codes.demo03;

/*
  keyword static modify instance method:
    key point:
      1. static instance method belongs to class
          not any objects of the class.
  issue description:
    in MyClass.java, instanceMethod() and staticInstanceMethod()
    different way to call both,
      1. call instance method by creating object
      2. directly call static instance method by Class name
    // myClass.staticInstanceMethod();
    // NO ERROR, but javac will convert it to MyClass.staticInstanceMethod();


*/
public class Demo11StaticMethod {
  /** Demo of static instance Method. */
  public static void main(String[] args) {
    // call instance method by creating object
    MyClass myClass = new MyClass();
    myClass.instanceMethod(); // accessing after object created.

    // directly accessing by the class's name "MyClass"
    MyClass.staticInstanceMethod(); 

    // for this Class to call the static method inside of itself.
    thisMethod(); // omitted the name of Class
    Demo11StaticMethod.thisMethod(); // same as calling thisMethod();
  } // main

  public static void thisMethod() {
    System.out.println("I am a static method inside of this Class.");
  }
}