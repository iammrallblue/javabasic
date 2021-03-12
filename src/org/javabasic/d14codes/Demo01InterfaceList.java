package org.javabasic.d14codes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
  Interface List:
    A Subinterface of Collection<E>, Iterable<E>
    Format:
      public interface List<E> extends Collection<E>
    Features:
      An ordered collection (also known as a sequence). FIFO
      List has index, it contains some index methods.
      duplicate elements are allowed.
    Index Methods:
      boolean add(E e)
        add element to the end of List.
      void add(int index,E element)
        insert specific element at the specific position in the list.
      E get(int index)
        Returns the element at the specified position in this list.
      E remove(int index)
        remove the element at the specific position in the List.
      E set(int index,E element)
        replace the element at the specific position in the List with the specific element.
    NOTICE:
        IndexOutOfBoundsException: the exception is warned by Collection<E>
        ArrayIndexOutOfBoundsException
        StringIndexOutOfBoundsException
*/
public class Demo01InterfaceList {
  /** . */
  public static void main(String[] args) {
    // create an object of List<E> by Polymorphism
    List<String> list = new ArrayList<>();
    // method add
    list.add("Abby");
    list.add("Bella");
    list.add("Cath");
    list.add("Danielle");
    // print out list
    System.out.println(list); // [Abby, Bella, Cath, Danielle]

    // method void add(int index, E e)
    list.add(2, "Cat");
    System.out.println(list); // [Abby, Bella, Cat, Cath, Danielle]

    // method E remove(int index)
    String removed = list.remove(2);
    System.out.println("Removed element is: " + removed);
    System.out.println(list);

    // method E set(int index, E e)
    String replaced = list.set(0, "Adam");
    System.out.println("the replaced element is: " + replaced);
    System.out.println(list);

    // E get(int index)
    String getElement = list.get(3);
    System.out.println("getting element: " + getElement);

    // method E get and iterator, for, and for/each
    System.out.println("iterating by iterator");
    Iterator<String> iter = list.iterator();
    while (iter.hasNext()) {
      String str = iter.next();
      System.out.println(str);
    }
    // for loop
    System.out.println("iterating by for loop");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    // for/each statement
    System.out.println("iterating by for/each");
    for (String string : list) {
      System.out.println(string);
    }
  } //
}
