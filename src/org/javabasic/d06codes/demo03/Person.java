package org.javabasic.d06codes.demo03;

/*
  A Person Class.
    Keyword "private"
      set variable age to private:
        prevent receiving all irrational values from outside
        to declare setter and getter to assign and get values.
    INDIRECTLY access private variable, we use setter and getter.
*/
public class Person {
  // fields
  String name;
  private int age;

  public int getAge() {
    return this.age;
  }

  /** prevent irrational values. */
  public void setAge(int age) {
    // if statement to determine whether values rational or not
    if (age > 0 && age < 140) {
      this.age = age;
    } else {
      System.out.println("Irrational values.");
    }
  }

  // instance method
  public void info() {
    System.out.println("My name is: " + name + ", ");
    System.out.println("I'm " + this.age + " years old.");
  }
}
