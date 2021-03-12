package org.javabasic.d09codes.demo02;

/*
  Demo of Inheritance:
    to inherit fields from Superclass
  Key point:
    When Superclass and Subclass both have fields which are same name;
    int number, field in both class.
    
    how to access fields which have same name;
     1. directly access by object of Subclass.
          Subclass sbc = Subclass();
          will call filed in Subclass first.
     2. indirectly access by call instance method.
          access variable depends on the instance method belonging.
          access variable if method belongs to Superclass, 
          access variable if method belongs to Subclass.

*/
public class Demo02Inheritance {
  /** Demo of fields in Superclass. */
  public static void main(String[] args) {
    // object of Superclass
    Superclass spc = new Superclass();
    System.out.println(spc.superNum);

    // object of Subclass
    Subclass sbc = new Subclass();
    System.out.println(sbc.superNum); // inherits from Superclass.
    System.out.println(sbc.subNum);

    // int number is in the Subclass.
    System.out.println(sbc.number); // 200

    // access variable number in Superclass by call superMethod()
    sbc.superMethod(); // 100
  } // main
}
