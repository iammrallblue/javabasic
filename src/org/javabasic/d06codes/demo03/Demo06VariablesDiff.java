package org.javabasic.d06codes.demo03;

/*
  Local Variables and Instance Variables (Data Fields)

    1. Define in different scope
    Local Variables, define inside of methods
    Instance Variables, define outside of methods, inside of Classes

    2. range of scope
    Local Variables, ONLY working inside of methods
    Instance Variables, working whole range of Classes

    3. default values of both are different
    Local Variables, dont have default values, MUST assign values before using them
    Instance Variables, do have default values, can be used before assigning.

    4. Stored in different location in MEMORY
    Local Variables go with Method(), and all methods are in the STACK.
    Instance Variables are in the HEAP with all new objects.

    5. Existence Time:
    Local Variables exist when methods() push on to STACK, disappear when methods() are out STACK.
    Instance Variables exist when objects being instantiated, destroy when no reference to objects.
*/
public class Demo06VariablesDiff {

  // Fields, Instance Variables
  String name; // not assigned

  /** local variable in method. */
  public void methodA() {
    // Local Variables
    int num = 20;
    System.out.println(num); // using num inside methodA()
    System.out.println(name); // using name in methodA(), name is not assigned.
  }

  /** local variable in method. */
  public void methodB() {
    // Local Variables
    // int age;
    // System.out.println(age); // ERROR, Local Variable is not initialized,

    // can use name, name is not assigned
    System.out.println(name); // null

    // System.out.println(num); // ERROR, num is methodA's Local Variable. CANNOT
    // use num outside of methodA()
  }

  // int param is Local Variable as well. but it can be called when unassigned
  // value
  // b/c when it is called by the method, it will be assigned when parameter
  // passing.
  public void methodC(int param) {
    System.out.println(param);
  }
}