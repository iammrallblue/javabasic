package org.javabasic.d13codes;

/*
  Interface List<E> and Interface Set<E>: extends Collection<E>
    Interface List<E>:
      1. an ordered collection, maintains the insertion order.
      2. same order in and out. has index which means can use for loop
      2.1 ListIterator can be used to traverse a List in both the directions(forward and backward)
      3. List<E> allows duplicate elements.
      4. List<E> implementations: ArrayList<E>, LinkedList<E>, Vector<E>
      5. List<E> allows any numbers of null values.
      6. Vector<E> is a legacy class of List<E>

    Interface Set<E>:
      1. an unordered collection, does not maintain any order.
        implementation class LinkedHashSet<E> maintains the elements in insertion order.
      2. Set<E> does not allow duplicate elements, elements should be unique.
      3. Set<E> implementations: HashSet, LinkedHashSet, TreeSet etc.
      4. Set<E> can have only a single null value at most.
      5. Iterator can use to iterate a Set<E>

  When to use Set and When to use List?
    The usage is purely depends on the requirement:
      If the requirement is to have only unique values then Set<E> is your best bet 
      as any implementation of Set maintains unique values only.
      
      If there is a need to maintain the insertion order irrespective of the duplicity 
      then List<E> is a best option. Both the implementations of List interface – 
      ArrayList and LinkedList sorts the elements in their insertion order.
*/
public class Demo00InterfaceListAndInterfaceSet {
}
