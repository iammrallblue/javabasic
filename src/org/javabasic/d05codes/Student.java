package org.javabasic.d05codes;

/*
  a Student class.

  ** in this class, Grade class refers as fields
      to call instance variable from Class Grade.
*/
public class Student {
  // fields
  int id;
  String name;
  String gender;
  int age;
  // Grade grade; // reference type default value null. needs to initialize
  Grade grade = new Grade(101, "K-8", "Room 1001");

  public Student() {

  }

  /** parameterized constructor. */
  public Student(int id, String name, String gender, int age, Grade grade) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.grade = grade;
  }

  /** a method to show information. */
  public void stuInfo() {
    System.out.println("Student's information: ");
    System.out.println("ID: " + id + " Name: " + name);
    System.out.println("Gender: " + gender + " Age: " + age);
    System.out.println("Grade: " + grade.number);
    System.out.println("Class Name: " + grade.name);
    System.out.println("Class Address: " + grade.address);
    // grade.number, grade.name, grade.address will throw
    // NullPointerException, if grade was not initialized.
  }

}
