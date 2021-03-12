package org.javabasic.d13codes;

import java.util.ArrayList;
import java.util.Iterator;

/*
  Generic Wildcard:
    Symbol of wildcard - ?
      ? represents any data type.
  Usage:
    CANNOT instantiate an object.
    ONLY used as argument of methods.
*/
public class GenericWildcard {
  /** . */
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(4);
    list.add(3);
    list.add(2);
    list.add(1);

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("Abby");
    list2.add("Bella");
    list2.add("Cath");
    list2.add("Danielle");
    list2.add("Eva");

    // ArrayList<?> list3 = new ArrayList<?>();
    // Error, Cannot instantiate the type ArrayList<?>

    printArray(list);
    printArray(list2);
  } // main

  // declare a method to iterate ArrayList<>.
  // however, when don't know the Generic type of ArrayList<>
  // we can use wildcard as parameter of method.
  /** Generic Does not have the concept of inheritance. */
  public static void printArray(ArrayList<?> tmpList) {
    // iterating by iterator
    Iterator<?> iter = tmpList.iterator();
    while (iter.hasNext()) {
      Object obj = iter.next();
      System.out.println(obj);
    }

    // iterating by for-each
    for (Object obj : tmpList) {
      System.out.println(obj);
    }
  }
}
