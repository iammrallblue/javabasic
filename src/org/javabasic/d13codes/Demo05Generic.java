package org.javabasic.d13codes;

import java.util.ArrayList;
import java.util.Iterator;

/*
  Generic:

  Collection with Generic: see method2()
  
  Collection without Generic: see method()
  CON:
    create object of Collection without Generic, it default type is Object.
    it can store any type of value.
  PRO:
    Unsecured, exception occurred.
*/
public class Demo05Generic {
  public static void main(String[] args) {
    method();
    method2();
  } // main

  // Collection and ArrayList with Generic
  private static void method2() {
    ArrayList<String> list = new ArrayList<>();
    list.add("Abby");
    list.add("Bella");
    list.add("Cath");
    list.add("Danielle");
    // error, The method add(int, String) in the type ArrayList<String>
    // is not applicable for the arguments (int)Ja
    // list.add(1);

    // iterating by iterator
    Iterator<String> iter = list.iterator();
    while (iter.hasNext()) {
      String str = iter.next();
      System.out.println(str);
    }
  }

  // Collection and ArrayList without Generic
  private static void method() {
    // ArrayList list = new ArrayList<>();
    ArrayList<String> list = new ArrayList<>();
    list.add("Abby");
    // list.add(1);

    // iterating by iterator.
    // Iterator iter = list.iterator();
    Iterator<String> iter = list.iterator();
    while (iter.hasNext()) {
      Object obj = iter.next();
      System.out.println(obj);

      // The Object obj Cannot call the method of Class String,
      // needs to downcasting
      String str = (String) obj;
      System.out.println(str.length());
      // java.lang.ClassCastException: b/c int cannot convert String.
    }
  }
}
