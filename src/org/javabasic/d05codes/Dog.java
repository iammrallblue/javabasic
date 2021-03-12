package org.javabasic.d05codes;

/*
  A dog class.

  Instance Variable and Local Variable:
    Instance Variable:
      1. declares in class
      2. has initial value (default).
      3. can have same name with Local Variable
          
    Local Variable:
      1. declares in method.
      2. no initial value, initialized before using it.
      3. can have same name with Instance Variable.
      4. Local variable precedes over the Instance variable. 
  Static Method:
    a static method belongs to Class. not the object of Class
    can not call a static method through object.
*/
public class Dog {
  // fields, instance variable
  String breed;
  private int age;
  String name;
  String color;

  /** a Constructor. */
  public Dog() {
    breed = "GS";
    age = 5;
    name = "lamei";
    color = "Brown";
  }

  /** a Constructor with parameters. */
  public Dog(String breed, int age, String name, String color) {
    this.breed = breed;
    this.age = age;
    this.name = name;
    this.color = color;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void dogInfo() {
    System.out.println("Breed: " + breed + " Age: " + age);
    System.out.println("Name: " + name + " Color: " + color);
  }

  /** a method. */
  public void method(double x) {
    int y = 0; // x, y are local variables
    // y is local variable, needs to initialize before use it.
    System.out.println(y);
    System.out.println(breed);
    System.out.println(age);
    System.out.println(name);
    System.out.println(color);
  }

  /** a method. */
  public void method2() {
    String name;
    name = "oovo"; // initialize before use.
    System.out.println(name); // error
    System.out.println();
    // call instance variable String name;
    System.out.println("Instance Variable: " + this.name);
  }

  /** a static method. */
  public static void method3() {
    // belongs to class.
    System.out.println("I'm a static method.");
  }
}
