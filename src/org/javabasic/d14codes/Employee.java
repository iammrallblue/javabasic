package org.javabasic.d14codes;

/*
  Class Employee:
    it needs to implement Interface Comparable<T>, b/c we need to override 
    method compareTo(T o) to sort the employees by ascending or descending order. 
*/
public class Employee implements Comparable<Employee> {
  // instance variable
  private String name;
  private int age;

  public Employee() {

  }

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // @Override
  // public String toString() {
  // return "Employee{Name: " + name + " , Age: " + age + "}";
  // }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
  }
  /*
   * print format by method toString() [Person{name='Abby', age=15},
   * Person{name='Bella', age=16}, Person{name='Cath', age=17},
   * Person{name='Danielle', age=18}]
   */

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // create a self-defined sorting rules. this example is based on comparison of ages of people,
  // (see Demo07ClassCollections.java)
  @Override
  public int compareTo(Employee e) {
    // custom collation, to compare two employees age.
    return this.getAge() - e.getAge(); // order by age ascending
  }
}
