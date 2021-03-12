package org.javabasic.d13codes;

import java.util.ArrayList;
import java.util.Collection;

/*
  java.util.Collections:
    a tool Class Collections, includes some methods for operating Collections
    all singly-linked Lists extends from the Interface Collection<E>

    Common Methods of Interface Collection<E>:
      boolean add(E e) 
        add elements to collection
        return true if added.
      boolean remove(Object o)
        remove elements from collection
        return true if removed.
      void clear()
        remove all elements from the collection
      boolean contains(Object o)
        inquire an elements if it existed.
        return true if inquired element existed
      boolean isEmpty()
        check if collection is empty
        return true if collection is empty
      int size()
        check the number of element
        return the number of element.
      Object[] toArray()
        collection to array[]
        Returns an array containing all o
        f the elements in this collection

        
*/
public class Demo01Collection {
  /** . */
  public static void main(String[] args) {
    // create object of Collection<E> (Polymorphism)
    Collection<String> list = new ArrayList<>();
    // add element to Collection list
    list.add("Hello");
    list.add("Bella");
    list.add("You");
    list.add("had");
    list.add("me");
    list.add("at-hello.");
    System.out.println(list);

    // boolean remove(Object obj)
    boolean isTrue = list.remove("Hello");
    System.out.println(isTrue); // true, removed Hello.
    System.out.println(list);

    // void clear
    // list.clear();
    System.out.println(list); // [] empty

    // boolean contains(Object o)
    boolean isContains = list.contains("Bella");
    System.out.println(isContains); // true,

    // boolean isEmpty()
    boolean isNull = list.isEmpty();
    System.out.println(isNull); // false

    // int size
    int length = list.size();
    System.out.println("the collection's length: " + length);

    // Object[] toArray()
    Object[] array = list.toArray();
    // for loop to iterate
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
