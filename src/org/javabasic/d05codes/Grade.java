package org.javabasic.d05codes;

/*
  a Grade Class:
    Fields:
      int number;
      String name;
      String address;

*/
public class Grade {
  // fields
  int number;
  String name;
  String address;

  public Grade() {

  }

  /** parameterized constructor. */
  public Grade(int number, String name, String address) {
    this.number = number;
    this.name = name;
    this.address = address;
  }

  public void showGrade() {
    System.out.println("Number: " + number + " Name: " + name + " Address: " + address);
  }
}
