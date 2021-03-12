package org.javabasic.d06codes.demo03;

/*
  issus description:
    if person.age set to negative value. it will be illogical.

    solution:
      to modify variable age as private in Person Class,
      then create getter and setter for accessing private
      variable in the Class.
      (see detail in Person.java)

*/
public class Demo08Person {
  /** Demo of Person Class. */
  public static void main(String[] args) {
    Person person = new Person();
    person.info(); // null and 0

    person.name = "Bella";
    // person.age = 18;
    person.setAge(18);
    person.info(); // Bella, 18
  } // main
}
