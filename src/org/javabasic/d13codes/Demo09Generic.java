package org.javabasic.d13codes;

import java.util.ArrayList;
import java.util.Collection;

/*
  Upper Bounded Wildcards:
     to relax the restrictions on a variable. 
     whereas the latter matches a list of type Number or any of its subclasses.
     (See getElement1())
  Lower Bounded Wildcards:
    that an upper bounded wildcard restricts the unknown type to be a specific type or a subtype of 
    that type and is represented using the extends keyword. In a similar way, 
    a lower bounded wildcard restricts the unknown type to be
     a specific type or a super type of that type.
     (See getElement2())
*/
public class Demo09Generic {
  /** . */
  public static void main(String[] args) {
    Collection<Integer> list1 = new ArrayList<>();
    // Collection<String> list2 = new ArrayList<>();
    Collection<Number> list3 = new ArrayList<>();
    // Collection<Object> list4 = new ArrayList<>();

    getElement1(list1);
    // getElement1(list2); // ERROR
    getElement1(list3);
    // getElement1(list4); // ERROR

    // getElement2(list1); // ERROR
    // getElement2(list2); // ERROR
    getElement2(list3);
    // getElement2(list4);

    // using list2
    // boolean isTrue = list2.add("Bella");
    // System.out.println(isTrue);
  } // main

  // Upper Bounded Wildcard:
  public static void getElement1(Collection<? extends Number> collection) {
  }

  // Lower Bounded Wildcard:
  public static void getElement2(Collection<? super Number> collection) {

  }
}