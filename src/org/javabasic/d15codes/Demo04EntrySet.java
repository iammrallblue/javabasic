package org.javabasic.d15codes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
  Second method to iterate map collection,

  methods of Interface Map<K,V>:
    public Set<Map.Entry<K,V>> entrySet() 
      Returns a Set view of the mappings contained in this map.
      The set is backed by the map
    Usage:
      1. using method entrySet(), to get interface Entry elements, then storing to a Set collection.
      2. iterate set collection, to get each entry element.
      3. using method getKey() and getValue of interface Entry<K,V> to get keys and values.
*/
public class Demo04EntrySet {
  /** . */
  public static void main(String[] args) {
    // object of Collection Map<E>, Polymorphism
    Map<String, Integer> map = new HashMap<>();
    map.put("Abby", 100);
    map.put("Bella", 95);
    map.put("Cath", 104);
    map.put("Danielle", 99);
    System.out.println(map);

    // using method entrySet()
    Set<Map.Entry<String, Integer>> set = map.entrySet();

    // iterating set collection by iterator
    Iterator<Map.Entry<String, Integer>> iter = set.iterator();
    while (iter.hasNext()) {
      Entry<String, Integer> entry = iter.next();
      // using method getKey() and getValue
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("Key= " + key + ", Value= " + value);
      System.out.println();
    }

    System.out.println("iterating by for/each statement.");
    // iterating set collection by for/each statement
    for (Map.Entry<String, Integer> entry : set) {
      // using method getKey() and getValue
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("Key= " + key + ", Value= " + value);
      System.out.println();
    }
  } // main
}
