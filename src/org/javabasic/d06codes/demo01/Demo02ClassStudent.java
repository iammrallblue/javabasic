package org.javabasic.d06codes.demo01;

/*
  Class Demo02Student:
    Create a class named Demo02Student to define some student properties 
    such as age, name, stuID, and gender.. etc. which is called data fields.
    
    Data Fields: (Instance Variables)
      such as age, name, gender.
      int age;
      String name;
      String gender;

      Each object gets its own copy of each non-static data field. 
      A non-static field like age is an instance variable for the class.

    Instance Methods:
      a self-defined method that inside of the Class.
      such as, sleep method, date method, study method
      public void sleepMethod(){}
      public void dateMethod(){}
      public void studyMethod()

    NOTICE:
      Instance variables are defined outside of methods, and inside of the Class.
      Instance methods don't need the keyword "static".
*/
public class Demo02ClassStudent {
  // data fields, instance variables
  int age = 20;
  String name = "Bella";

  // Instance method
  public void studyMethod() {
    System.out.println("I am studying now.");
  }

  public void sleepMethod() {
    System.out.println("I am tired, sleep...");
  }
}
