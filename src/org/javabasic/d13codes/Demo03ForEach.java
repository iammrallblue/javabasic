package org.javabasic.d13codes;

import java.util.ArrayList;

/*
  Interface Iterable<T>
    implementation class which implements Interface Iterable<T>,
    its object can use for-each loop statement
    example:
      Collection<E> extends Iterable<T>. can use for-each loop statement.
    For-Each Statement:
      to iterate collection and array.
    Format:
      for(Collection/ArrayList list : )
      {
        body of for-each
      }
    NOTICE: 
      for-each statement MUST work with Collection or Array/ArrayList
      for-each statement ONLY used as iterating tool.
*/
public class Demo03ForEach {
  /** . */
  public static void main(String[] args) {
    method();
    method2();
  } // main

  // iterating collections by using for-each statement
  private static void method2() {
    ArrayList<String> list = new ArrayList<>();
    list.add("Abby");
    list.add("Bella");
    list.add("Cath");
    list.add("Danielle");
    list.add("Eva");
    for (String str : list) {
      System.out.println(str);
    }
  }

  // using for-each statement
  private static void method() {
    // int[] array = new [5];
    int[] array = { 5, 4, 3, 2, 1 };
    for (int i : array) {
      System.out.println(i);
    }
  }
}
