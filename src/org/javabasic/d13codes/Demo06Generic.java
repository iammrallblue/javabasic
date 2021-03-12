package org.javabasic.d13codes;

public class Demo06Generic {
  /** . */
  public static void main(String[] args) {
    // example shows known data type as Object.
    // GenericClass gc = new GenericClass();
    // // set name
    // gc.setName("Bella, you");

    // // get name 
    // String name = gc.getName();
    // System.out.println(name);

    // if data type is known, GenericClass has to set type as E (See GenericClass)
    // data type as String
    GenericClass<String> gc = new GenericClass<>();
    // assign value to setName()
    gc.setName("Bella");

    // get name
    String name = gc.getName();
    System.out.println(name);

    // data type set as Integer
    GenericClass<Integer> gc2 = new GenericClass<>();
    gc2.setAge(18);
    
    // get name
    int age = gc2.getAge();
    System.out.println("age: " + age);
  } // main
}
