package org.javabasic.d15codes;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
  Class LinkedHashMap<K,V>:
    public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>
      Hash table and linked list implementation of the Map interface,
      with predictable iteration order.
    principle:
      hash table + Linked list (linked list is for the record of elements' order)
*/
public class Demo06LinkedHashMap {
  /** . */
  public static void main(String[] args) {
    // object of Class hashMap<K,V>
    HashMap<String, String> map = new HashMap<>();
    map.put("c", "c");
    map.put("a", "a");
    map.put("d", "d");
    map.put("b", "b");
    map.put("a", "c");
    System.out.println(map); // {a=a, b=b, c=c, d=d}
    // the result indicated that key can be duplicated.
    // it is an unordered, get and put have different order.

    // object of Class LinkedHashMap<K,V>
    LinkedHashMap<String, String> linkedMap = new LinkedHashMap<>();
    linkedMap.put("c", "c");
    linkedMap.put("a", "a");
    linkedMap.put("d", "d");
    linkedMap.put("b", "b");
    linkedMap.put("a", "c");
    System.out.println(linkedMap); // {c=c, a=c, d=d, b=b} 
    // the result indicated that key can be duplicated.
    // get and put have same order , same in same out. it is ordered.
  } // main
}
