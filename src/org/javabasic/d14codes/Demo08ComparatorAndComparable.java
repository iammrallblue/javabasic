package org.javabasic.d14codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
  Class Collections：
    Sorting Methods:
      public static <T extends Comparable<? super T>> void sort(List<T> list) and
        ** IMPORTANT ** (See Demo07ClassCollections.java)
      
      public static <T> void sort(List<T> list, Comparator<? super E> c)
        Sorts the specified list according to the order induced by the
        specified comparator (Third party). All elements in the list must be mutually
        comparable using the specified comparator
      
  Interface Comparator<T> and Interface Comparable<T> Differences:
    Comparable is comparing itself with other's, then implements Interface Comparable<T>
    to override method compareTo(T o) to make own sorting rules.
    Comparator is to find third
*/
public class Demo08ComparatorAndComparable {
  /** sorting by interface Comparator. */
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(7);
    list.add(3);
    list.add(1);
    list.add(9);

    System.out.println("the original order: " + list);
    // calling method sort
    Collections.sort(list, new Comparator<Integer>() {
      // override method compare(T o1, T o2) to make sorting rules.
      @Override
      public int compare(Integer o1, Integer o2) {
        // return o2 - o1; // Descending order [9, 7, 4, 3, 1]
        return o1 - o2; // Ascending order [1, 3, 4, 7, 9]
      }
    });
    System.out.println(list);

    // method public static <T> void sort(List<T> list, Comparator<? super E> c)
    ArrayList<Student2> list2 = new ArrayList<>();
    list2.add(new Student2("Abby", 16));
    list2.add(new Student2("Bella", 15));
    list2.add(new Student2("Cath", 18));
    list2.add(new Student2("Danielle", 17));
    System.out.println("the original order: " + list2);
    // the original order: [Student{name='Abby', age=16}, Student{name='Bella',
    // age=15}, Student{name='Cath', age=18}, Student{name='Danielle', age=17}]

    // sorting by method sort()
    Collections.sort(list2, new Comparator<Student2>() {
      // override method compare() to make sorting rules.
      @Override
      public int compare(Student2 o1, Student2 o2) {
        int result = o1.getAge() - o2.getAge();
        if (result == 0) {
          result = o1.getName().charAt(0) - o2.getName().charAt(0);
        }
        return result;
        // return o1 - o2;
      }
    });
    System.out.println("new order: " + list2);
    // new order: [Student{name='Bella', age=15}, Student{name='Abby', age=16},
    // Student{name='Danielle', age=17}, Student{name='Cath', age=18}]
  } // main
}