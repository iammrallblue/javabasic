package org.javabasic.d06codes;

/*
  A student class: (a standard class, called java bean.)
    1. Sets fields to private, creates getter and setter
        for transferring values.
*/
public class Student3 {
  // fields
  private String name;
  private int age;
  private String gender;
  private double grade;

  public Student3() {
    // non-parameterized constructor
  }

  /** parameterized constructor. */
  public Student3(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  /** parameterized constructor to call another constructor. */
  public Student3(String name, int age, String gender, double grade) {
    // not necessary to assign all values of instance variables
    // using keyword "this" to call constructor above
    // this.name = name;
    // this.age = age;
    // this.gender = gender;
    // above three statements equal to this(name,age,gender)
    this(name, age, gender);
    this.grade = grade;
    // ** IMPORTANT, the statement called by this MUST be the first statement in
    // code block.
    // ONLY call by constructors.
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  /** prevent a irrational value. */
  public void setAge(int age) {
    // limit the value within 1 ~ 140
    if (age >= 1 && age <= 140) {
      this.age = age;
    } else {
      this.age = 21;
    }
  }

  public int getAge() {
    return this.age;
  }

  /** limit the gender. */
  public void setGender(String gender) {
    if (gender == "Male" || gender == "Female") {
      this.gender = gender;
    } else {
      this.gender = "Male";
    }
  }

  public String getGender() {
    return this.gender;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  public double getGrade() {
    return grade;
  }
}
