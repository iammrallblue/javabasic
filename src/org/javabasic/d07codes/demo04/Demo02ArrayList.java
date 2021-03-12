package org.javabasic.d07codes.demo04;

import java.util.ArrayList;

/*
  java.util.ArrayList;
    ArrayList class is a resizable array.
    ArrayList is one kind of collection.
      public class ArrayList<E> {

      }
    Key point: (diff with Array)
      1. the length of Array is NOT changeable 
          the length of ArrayList is changeable and flexible
      2. ArrayList with <E>, means Generic, Generic ONLY can be reference data type, 
          and the data type of ArrayList<E> MUST be the same in a Collection.
      3. How to use common methods of ArrayList<E>.
      4. How to iterate an ArrayList<E> by for-each statement.
    Common Method of ArrayList<E>:
      public boolean add(E e) {}
        Appends the specified element to the end of this list.
      public E get(int index) {}
        Returns the element at the specified position in this list
      public E remove(int index) {}
        Removes the element at the specified position in this list.
      public int size() {}
        Returns the number of elements in this list.

*/
public class Demo02ArrayList {
  /** Demo of ArrayList<>. */
  public static void main(String[] args) {
    // declare a ArrayList<String> collection, all element MUST be String
    ArrayList<String> list = new ArrayList<>();
    System.out.println(list); // empty []

    // add elements to ArrayList<String> collection
    list.add("Abby");
    list.add("Bella");
    list.add("Cathy");

    // print collection
    System.out.println(list); // [Abby, Bella, Cathy]

    // Common Methods of ArrayList
    // 1. add(E e) method
    boolean isSuccess = list.add("Yua");
    System.out.println(list); // [Abby, Bella, Cathy, Yua] Yua is new added
    System.out.println(isSuccess); // true, b/c Yua is successfully added to collection.

    // 2. E get() method, get element from the collection.
    // NOTICE: index starts from [0], <E> is String
    String value = list.get(2);
    System.out.println("The 2nd index is: " + value);

    // 3. remove(), delete element from the collection.
    String removed = list.remove(3);
    System.out.println(removed + " is removed from the collection.");

    System.out.println(list);

    // 4. size(), get the length of the collection.
    int size = list.size();
    System.out.println("The length of ArrayList is: " + size);

    // 5. iterating ArrayList
    System.out.println("Iterating result: ");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}