package org.javabasic.practices.inheritance;

/*
  A Student Class (Subclass) extends from Person Class
*/
public class Student extends Person {
  // fields
  int id;

  public Student() {

  }

  // /** parameterized constructor. */
  // public Student(String name, String gender, int age, int id) {
  // super.name = name;
  // super.gender = gender;
  // super.age = age;
  // this.id = id;
  // }

  /** parameterized constructor. */
  public Student(String name, String gender, int age, int id) {
    // call Superclass' constructor, ONLY inside of constructor of subclass.
    // super(); super() MUST be the first statement.
    super(name, gender, age); 
    this.id = id;
  }

  // instance method
  public void study() {
    System.out.println(name + " is learning the chapter of inheritance.");
  }

  @Override
  public void introMethod() {
    // name, this.name == super.name
    // System.out.println("Name: " + super.name + "\tGender: " + gender + "\tAge: "
    // +
    // age);
    super.introMethod(); // call introMethod from Superclass.
    System.out.println("Student ID: " + this.id);
  }
}
