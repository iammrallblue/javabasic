package org.javabasic.d14codes;

import java.util.ArrayList;
import java.util.Collections;

/*
  Class Collections: (Tool Class) for operating Collection Classes.
 
    Methods: (** Static Methods)
      public static <T> boolean addAll(Collection<? super T> c, T... elements)
        Adds all of the specified elements to the specified collection.
      public static void shuffle(List<?> list)
        Randomly permute the specified list using the specified source of randomness. 
        All permutations occur with equal likelihood assuming that the source of randomness is fair.
      public static <T extends Comparable<? super T>> void sort(List<T> list) ** IMPORTANT **
        Sorts the specified list into ASCENDING order, according to the natural ordering of its elements.
        NOTICE:
          self-defined classes use the method sort(List<T> list) of Class Collections. they needs to implements 
          the Interface Comparable<T>, then override the method compareTo(T o) 
            public int compareTo(T o);
              method compareTo(T o) is the method for sorting elements in Collections OR ArrayList<E>
              it implements from Interface Comparable<T>, and needs to be overridden when order
              of elements need sorting.

*/
public class Demo07ClassCollections {
  /** . */
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    // add elements
    // list.add("A");
    // list.add("B");
    // list.add("C");
    // list.add("D");
    // System.out.println(list); // [A, B, C, D]

    // too complex to add elements to list. using method addAll()
    Collections.addAll(list, "a", "b", "c", "d", "e", "f"); // same result as list.add()
    System.out.println(list); // [a, b, c, d]

    // method shuffle()
    Collections.shuffle(list);
    System.out.println(list); // [a, c, e, f, b, d]

    // example of method sort()
    ArrayList<Integer> list2 = new ArrayList<>();
    // laddAll()
    Collections.addAll(list2, 5, 9, 6, 4, 1, 3, 8, 7, 2);
    System.out.println("the original order: " + list2); // [5, 9, 6, 4, 1, 3, 8, 7, 2]

    // method sort()
    Collections.sort(list2);
    System.out.println("sorting by Collections.sort(): " + list2); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    // Ascending from 1 to 9 aka natural order. same like "a,b,c" is the natural
    // order as well.

    // using ArrayList<Employee> to store objects of Class Employee.
    ArrayList<Employee> list3 = new ArrayList<>();
    list3.add(new Employee("Abby", 18));
    list3.add(new Employee("Bella", 16));
    list3.add(new Employee("Cath", 13));
    list3.add(new Employee("Danielle", 15));
    System.out.println(list3);
    // [Person{name='Abby', age=18}, Person{name='Bella', age=16},
    // Person{name='Cath', age=13}, Person{name='Danielle', age=15}]

    // override the compareTo() in Class Employee
    Collections.sort(list3); // ERROR
    // ERROR when compareTo(T o) did not override,
    // The method sort(List<T>) in the type Collections is not applicable for
    // the arguments (ArrayList<Employee>)
    
    System.out.println(list3); // printout result by order of ascending age.
    // [Person{name='Cath', age=13}, Person{name='Danielle', age=15},
    // Person{name='Bella', age=16}, Person{name='Abby', age=18}]//
  } // main

}
