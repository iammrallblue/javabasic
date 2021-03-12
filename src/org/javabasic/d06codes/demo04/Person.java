package org.javabasic.d06codes.demo04;

/*
  keyword "this"
    refers to the current object in a method or constructor.
    this can also be used to:
      Invoke current class constructor
      Invoke current class method
      Return the current class object
      Pass an argument in the method call
      Pass an argument in the constructor call
  issue description:
    1. when instance variable and local variable (include parameter in methods)
        have same name, to determine them we use keyword this to emphasize instance variable
        (see method(String name) has same variable name with instance variable)
        format:
          this.age; or this.name;
    2. in methods, if instance variable and local variable (include parameter in methods)
        have same variable names, it always uses local variable first, therefore, keyword this
        is emphasized the instance variable in methods when it is used.
*/
public class Person {
  // fields
  String name;

  public void greeting(String name) {
    System.out.println(name + ", I am " + this.name);
  }
}