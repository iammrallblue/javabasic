package org.javabasic.d06codes;

/*
  Constructor:
    A constructor establishes an object; a default constructor is one that requires no arguments. 
    A default constructor is created automatically by the Java compiler 
    for any class you create whenever you do not write your own constructor.

    Employee employee = new Employee(); 
    the creation of an object is invoked the constructor of Class Employee.

    Format:
      public Employee() {}
      public Employee(argument list) {}
    NOTICE:
      1. identifier of constructor MUST be the same with identifier of Class
      2. A constructor has no return value, no void keyword.
      3. if there is no any constructor inside of Class, the complier will default a 
          constructor to Class. default constructor will not be produced after self-defining.
      4. Constructor can be overloading.
          *** overloading: same name of method, different argument list.
*/
public class Employee {
  // Instance Variables
  String name;
  int age;

  // Constructors
  public Employee() {
    // constructor
    System.out.println("Non-Parameterized Constructor is executed.");
  }

  /** . */
  public Employee(String name, int age) {
    // constructor with parameter.
    System.out.println("Parameterized Constructor is executed.");
    // System.out.println(name + " is Employee, " + "She is " + age);
    this.name = name;
    this.age = age;
  }

  // Setter & Getter
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}
