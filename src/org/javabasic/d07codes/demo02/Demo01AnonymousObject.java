package org.javabasic.d07codes.demo02;

/*
  Anonymous Object:
    a standard object of class
      Person person = new Person();

  Key point:
    1. it is an unnamed object. does not have left side of equal symbol
        Format:
          person.setName.setName("Cath");
    2. Anonymous Object, only has "new Person()" and only use one time

    3. when uses Anonymous Object, be sure an Object definitely ONLY use once, 
        then we can use Anonymous Object, (see codes below)
        new Person().setName("Cath") will ONLY execute one time then disappeared.
        therefore
        new Person().showName() will give result, null.
*/
public class Demo01AnonymousObject {
  /** Demo of Anonymous Object. */
  public static void main(String[] args) {
    Person person = new Person();
    // normal creating a Person object.
    person.setName("Bella");
    person.showName();

    // creating Anonymous object of Person Class.
    new Person().setName("Cath"); // "Cath" will not assign to the next
    // Anonymous Object, invokes method from Person class and only use one time
    new Person().showName(); // it's a new object,
    // result is null.
  } // main
} // DemoAnonymousObject