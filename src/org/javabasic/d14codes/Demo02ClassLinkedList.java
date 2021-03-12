package org.javabasic.d14codes;

import java.util.LinkedList;

/*
  Class LinkedList<E>:
    public class LinkedList<E> extends AbstractSequentialList<E> 
    implements List<E>, Deque<E>, Cloneable, Serializable
    1.Linkedlist structure:quick query, slow insertion and deletion
    2.LinkedList has some specific methods to opt first and last elements
    NOTICE:
      CANNOT use the Polymorphism, when using specific methods of LinkedList<E>

    Specific Methods of LinkedList<E>:
      - public void addFirst(E e): (same as method push(E e))
          Inserts the specified element at the beginning of this list.
      - public void addLast(E e): (same as method add(E e))
          Appends the specified element to the end of this list.
      - public void push(E e): (same as method addFirst(E e))
          Pushes an element onto the stack represented by this list. 
          In other words, inserts the element at the front of this list.
      - public E getFirst():
          Returns the first element in this list.
      - public E getLast():
          Returns the last element in this list.
      - public E removeFirst():
          Removes and returns the first element from this list.
      - public E removeLast():
          Removes and returns the last element from this list.
      - public E pop(): (same as method removeFirst())
          Pops an element from the stack represented by this list. 
          In other words, removes and returns the first element of this list.
      - public boolean isEmpty()：
          Returns true if this collection contains no elements.
        ** isEmpty() in interface Collection<E>
*/
public class Demo02ClassLinkedList {
  /** . */
  public static void main(String[] args) {
    // a LinkedList<E> generic type is String
    LinkedList<String> list = new LinkedList<>();
    list.add("Abby");
    list.add("Bella");
    list.add("Cath");
    list.add("Danielle");

    // to opt elements at the list
    // String whatRemoved = list.removeFirst();
    // System.out.println(whatRemoved);
    // System.out.println(list);
    // a LinkedList<E> generic type is Integer
    // method pop remove and return the selected element
    String firstRemoved = list.pop();
    System.out.println("the removed element: " + firstRemoved); // Abby
    System.out.println(list); // [Bella, Cath, Danielle]

    addMethods();
    getMethods();
    removeMethods();
  } // main

  // specific methods of LinkedList<E>
  private static void addMethods() {
    // create object of LinkedList<E>, cannot use Polymorphism
    // b/c specific methods ONLY belong to LinkedList<E> itself.
    LinkedList<String> linkedList = new LinkedList<>();

    // add()
    linkedList.add("Abby");
    linkedList.add("Bella");
    linkedList.add("Cath");
    System.out.println(linkedList); // [Abby, Bella, Cath]

    // addFirst() and push() add element to the first of LinkedList<E>
    linkedList.addFirst("Becky");
    System.out.println(linkedList); // [Becky, Abby, Bella, Cath]
    linkedList.push("Ava");
    System.out.println(linkedList); // [Ava, Becky, Abby, Bella, Cath]

    // addLast() and add() add element to the last of LinkedList<E>
    linkedList.addLast("Zoe");
    System.out.println(linkedList); // [Ava, Becky, Abby, Bella, Cath, Zoe]
    linkedList.add("Zena");
    System.out.println(linkedList); // [Ava, Becky, Abby, Bella, Cath, Zoe, Zena]
  } // addMethods

  // getFirst() and getLast(0)
  private static void getMethods() {
    // create object of LinkedList<E>, cannot use Polymorphism
    // b/c specific methods ONLY belong to LinkedList<E> itself.
    LinkedList<String> linkedList = new LinkedList<>();

    // add()
    linkedList.add("Abby");
    linkedList.add("Bella");
    linkedList.add("Cath");

    // clear()
    // linkedList.clear(); // clear the LinkedList<E>

    // add if statement to determine that if LinkedList<E> is empty
    // if LinkedList<E> is not empty, execute if code block
    if (!linkedList.isEmpty()) {
      String first = linkedList.getFirst();
      System.out.println("the first element is: " + first);
      String last = linkedList.getLast();
      System.out.println("the last element is: " + last);
      System.out.println(linkedList);
    } else {
      System.out.println("The Collection LinkedList<E> is empty");
    }
  } // getMethods

  // removeFirst() and removeLast()
  private static void removeMethods() {
    // create object of LinkedList<E>, cannot use Polymorphism
    // b/c specific methods ONLY belong to LinkedList<E> itself.
    LinkedList<String> linkedList = new LinkedList<>();

    // add()
    linkedList.add("Abby");
    linkedList.add("Bella");
    linkedList.add("Cath");
    System.out.println(linkedList); // [Abby, Bella, Cath]

    // removeFirst() and pop()
    String removedElement = linkedList.removeFirst();
    System.out.println("The removed element is: " + removedElement); // The removed element is: Abby
    System.out.println(linkedList); // [Bella, Cath]
    
    // pop()
    // String removedPop = linkedList.pop();
    // System.out.println("the removed element is: " + removedPop);
    // System.out.println(linkedList);

    // removeLast()
    String removedLast = linkedList.removeLast();
    System.out.println("The remove element is: " + removedLast);
    System.out.println(linkedList); // [Bella]
  } // removeMethods
}
