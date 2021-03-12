package org.javabasic.d15codes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
  interface Map<K,V>:
    1. Finding the value by the key,

    methods of interface Map<K,V>:
      Set<K> keySet();
        Returns a {@link Set} view of the keys contained in this map.
        The set is backed by the map, so changes to the map are
        reflected in the set, and vice-versa. 
      Usage:
        1. using the method keyset() to get all keys, then storing to a Set Collection,
            data type depends on the key.
        2. iterating collection set to get keys.
        3. using the method get(key) to find out the value.

*/
public class Demo02KeySet {
  /** . */
  public static void main(String[] args) {
    // object of Collection Map<E>, Polymorphism
    Map<String, Integer> map = new HashMap<>();
    map.put("Abby", 100);
    map.put("Bella", 95);
    map.put("Cath", 104);
    map.put("Danielle", 99);
    System.out.println(map);

    // using method keyset() to get keys from the Map Collection,
    // then storing to Set<E>
    Set<String> set = map.keySet();

    // iterating set collection by iterator
    Iterator<String> iter = set.iterator();
    while (iter.hasNext()) {
      String str = iter.next();
      // System.out.println(str); // Danielle Abby Cath

      // find out values by method get(key)
      Integer value = map.get(str);
      System.out.println("key: " + str + " Value: " + value);
    }

    System.out.println("Iterating by for/each statement.");
    // iterating set collection by for/each statement
    for (String key : set) {
      // using method get(key) ot find values
      Integer value = map.get(key);
      System.out.println("Key: " + key + " Value: " + value);
    }
  } // main
}
