package org.javabasic.d13codes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
  Interface Iterator<E>:
    An iterator over a collection. 
    Iterator takes the place of Enumeration in the Java Collections Framework. 
    Iterators differ from enumerations in two ways:
      1. Iterators allow the caller to remove elements from the underlying collection 
          during the iteration with well-defined semantics.
      2. Method names have been improved.
  
    Common Methods of Interface Iterator<E>:
      boolean hasNext()
        return true the iterator has next elements
        return true 
      E next()
        Returns the next element in the iteration.
        Returns:
          the next element in the iteration
        Throws:
          NoSuchElementException - if the iteration has no more elements
      default void remove()
  NOTICE:
    Cannot use Interface Iterator<E> directly, have to use its implementation class
    by using a method iterator() from the Interface Collection<E>. it returned object of
    the interface Iterator<E>

    Interface Iterator<E> has the Generic, What generic Interface Collection<E> is, 
    what generic Interface Iterator<E> will be.
  
  Usage:
    Iterator<> iter = Collection.iterator(); (Polymorphism)
    using hasNext() and next()
*/
public class Demo02InterfaceIterator {
  /** . */
  public static void main(String[] args) {
    // create object of Interface Collection<>
    Collection<String> list = new ArrayList<>();
    list.add("Abby");
    list.add("Bella");
    list.add("Cath");
    list.add("Danielle");
    list.add("Eva");

    // using iterator() (Polymorphism)
    Iterator<String> iter = list.iterator();
    boolean isTrue = iter.hasNext();
    System.out.println(isTrue); // true, it has elements.

    // iterating. don't know exactly quality of element to use while loop
    while (iter.hasNext()) {
      String element = iter.next();
      System.out.print(element + " ");
    }

    // for loop
    for (Iterator<String> iter2 = list.iterator(); iter2.hasNext();) {
      String str = iter2.next();
      System.out.println(str);
    }
  } // main
}
