package org.javabasic.d06codes.demo03;

/*
  example of getter and setter: 
    1. when instance variables are private, getter and setter MUST be declared.
    2. for boolean variable, getter MUST in form isXXX()
 */
public class Student {

  // fields
  private String name;
  private int age;
  private boolean male; // is a male? value: true OR false

  // getter and setter to assign values to name and age
  public void setName(String tmpName) {
    name = tmpName;
  }

  public String getName() {
    return name;
  }

  public void setAge(int tmpAge) {
    age = tmpAge;
  }

  public int getAge() {
    return age;
  }

  // ** getter and setter for boolean variable
  public void setMale(boolean b) {
    male = b;
  }

  // it is different name as getXxx(), instead of isXxx()
  public boolean isMale() {
    return male;
  }
}