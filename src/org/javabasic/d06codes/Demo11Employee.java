package org.javabasic.d06codes;

public class Demo11Employee {
  /** Demo of Employee Class. */
  public static void main(String[] args) {
    Employee employee = new Employee();
    System.out.println(employee);
    
    Employee employee2 = new Employee("Bella", 19);
    System.out.println(employee2);
    System.out.println("Name: " + employee2.getName() + ", Age: " + employee2.getAge());
    employee2.setAge(20); // getter and setter is provided for changing values.
    System.out.println("Name: " + employee2.getName() + ", Age: " + employee2.getAge());
  }
}
