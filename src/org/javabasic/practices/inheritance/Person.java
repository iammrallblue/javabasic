package org.javabasic.practices.inheritance;

/*
  A superclass Person.
*/
public class Person {
  // fields
  String name;
  String gender;
  int age;

  public Person() {

  }

  /** parameterized constructor. */
  public Person(String name, String gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  // instance method
  public void introMethod() {
    System.out.println("Name: " + name + "\tGender: " + gender + "\tAge: " + age);
  }
}
