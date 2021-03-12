package org.javabasic.d13codes;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo10GenericReview {
  /** . */
  public static void main(String[] args) {
    // create an object of Generic Class and determine generic type
    GenericReview<String> gr = new GenericReview<>();
    gr.printMethod("Generic is determined as String type");

    // create an object of Generic Class and determine generic type
    GenericReview<Integer> gr2 = new GenericReview<>();
    System.out.println("Generic is determined as Integer type:");
    gr2.printMethod(2333);

    // create object of implementation class of generic interface.
    GenericInterfaceReviewImpl<String> gen = new GenericInterfaceReviewImpl<>();
    gen.printMethod("String Type.");

    GenericInterfaceReviewImpl<Double> gen2 = new GenericInterfaceReviewImpl<>();
    gen2.printMethod(2.333);

    // Generic Wildcard Review
    ArrayList<String> list = new ArrayList<>();
    list.add("Abby");
    list.add("Bella");
    list.add("Cath");

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(3);
    list2.add(2);
    list2.add(1);

    printMethod(list);
    printMethod(list2);
    // printMethod(list2); // ERROR, b/c argument's generic type of printMethod is
    // determined as String. to solve it by using wildcard.
  } // main

  /** A method contains iterating by for, for/each, iterator. */
  public static void printMethod(ArrayList<?> temp) {
    System.out.println("by for loop.");
    for (int i = 0; i < temp.size(); i++) {
      System.out.println(temp.get(i));
    }
    System.out.println("by for/each.");
    // for (String str : temp) {
    for (Object obj : temp) {
      System.out.println(obj);
    }
    System.out.println("by iterator()");
    Iterator<?> iter = temp.iterator();
    while (iter.hasNext()) {
      // String str = iter.next();
      Object obj = iter.next();
      System.out.println(obj);
    }
  }

}
