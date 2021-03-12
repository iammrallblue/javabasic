package org.javabasic.d14codes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
  Interface Set<E>:
    Format:
      public interface Set<E> extends Collection<E>
        A collection that contains no duplicate elements
        1. NOT allowed duplicate elements
        2. NOT have index, and methods with index, CANNOT use for loop statement.
    Implementation classes:
      Class HashSet<E>:
        public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable
        1. NOT allowed duplicate elements
        2. NOT have index, and methods with index, CANNOT use for loop statement.
        3. HashSet is an unordered collection, the order of in and out can be different 
        4. based on hash table structure which means fast query
*/
public class Demo03InterfaceSet {
  /** .  */
  public static void main(String[] args) {
    // Polymorphism, create object of Set<E> Collection
    Set<Integer> set = new HashSet<>();
    // method add to add elements
    set.add(1);
    set.add(3);
    set.add(2);
    set.add(1);

    // since for loop is unavailable. using iterator()
    Iterator<Integer> iter = set.iterator();
    while (iter.hasNext()) {
      int var = iter.next();
      System.out.println(var); // 1 2 3
      // an ordered, no duplicate element result.
    }

    // for/each statement
    for (Integer var : set) {
      System.out.println(var);  // 1 2 3 
    }
  } // main
}
