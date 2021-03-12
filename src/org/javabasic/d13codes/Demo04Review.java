package org.javabasic.d13codes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo04Review {
  /** . */
  public static void main(String[] args) {
    // create object of Collection **Polymorphism.
    Collection<String> collection = new ArrayList<>();
    collection.add("Hello");
    collection.add("Bella");
    collection.add("at-Hello");

    // iterating by iterator.
    Iterator<String> iter = collection.iterator();
    while (iter.hasNext()) {
      String str = iter.next();
      System.out.println(str);
    }

    // iterating by for-each statement
    for (String str : collection) {
      System.out.println(str);
    }
  }
}
