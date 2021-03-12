package org.javabasic.d15codes;

import java.util.HashMap;
import java.util.Map;

/*
  Collection Map:
    public interface Map<K,V>:
      Features:
        1. An object that maps keys to values, ** key and value **
        2. data type of key and value can be the same, or not the same
            (such as String keys, String values.)
        3. ** IMPORTANT ** Key CANNOT be duplicated, but Values.
        4. the key-value pair is unique, which means one key is ONLY for one value.

    Implementation Classes of interface Map<K,V>:
      public class HashMap<K,V> implements Map<K,V>
        1. map usually acts as a binned (bucketed) hash table, fast query
            ** before JDK1.8,  Array + Singly linked list
            ** after JDK1.8, Array + singly linked list
                            Array + red-black tree (b/c of length, improve query speed.)
        2. HashMap is unordered, order of get and put will be different.
      public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>
        1. Hash table and linked list implementation of the Map interface, 
            with predictable iteration order.
        2. LinkedHashMap is an ordered collection, get and put will be same, and improve
            the predictable iteration order

    Common methods of interface Map<K,V>:
      public V put(K key, V value)
        Associates the specified value with the specified key in this map (optional operation). 
        put key, and value to Collection.
      public V remove(Object key) 
        Removes the mapping for the specified key from this map if present.
      public V get(Object key)
        Returns the value to which the specified key is mapped,
        or return null, if map contained no value for the key
      
      public V get(Object key)
        Returns the value to which the specified key is mapped,
        or return null, if map contained no value for the key
      public boolean containsKey(Object key) {
        return getNode(hash(key), key) != null;
        Returns true if this map contains a mapping for the specified key.
        

*/
public class Demo01CollectionMap {
  /** common methods of HashMap<>. */
  public static void main(String[] args) {
    putMethod();
    removeMethod();
    getMethod();
    containsKeyMethod();
  } // main

  // method containsKey()
  private static void containsKeyMethod() {
    // object of Collection Map<E>, Polymorphism
    Map<String, Integer> map = new HashMap<>();
    map.put("Abby", 100);
    map.put("Bella", 95);
    map.put("Cath", 104);
    map.put("Danielle", 99);
    System.out.println(map);

    // containsKey()
    boolean isTrue = map.containsKey("Abby");
    System.out.println(isTrue); // true

    boolean isTrue2 = map.containsKey("oh");
    System.out.println(isTrue2); // false
  }

  // public V get(Object key)
  private static void getMethod() {
    // object of Collection Map<E>, Polymorphism
    Map<String, Integer> map = new HashMap<>();
    map.put("Abby", 100);
    map.put("Bella", 95);
    map.put("Cath", 104);
    map.put("Danielle", 99);
    System.out.println(map);

    Integer value = map.get("Abby");
    System.out.println(value); // 100

    Integer value2 = map.get("Oh");
    System.out.println(value2); // null
  }

  // method V remove(Object key)
  private static void removeMethod() {
    // object of Collection Map<E>, Polymorphism
    Map<String, Integer> map = new HashMap<>();
    map.put("Abby", 100);
    map.put("Bella", 95);
    map.put("Cath", 104);
    map.put("Danielle", 99);
    System.out.println(map);

    // remove element
    Integer value = map.remove("Abby");
    System.out.println(value); // 100 Abby and 100 are removed

    System.out.println(map); // {Danielle=99, Cath=104, Bella=95}

    // remove inexistent element
    Integer value2 = map.remove("Eva");
    System.out.println(value2); // null
  }

  // method V put(K key, V value)
  private static void putMethod() {
    // create object of Collection Map, Polymorphism
    Map<String, String> map = new HashMap<>();
    // put
    String key1 = map.put("A", "Abby");
    System.out.println("The key: " + key1); // null value
    // null value means so far there is no duplicate key value.

    String key2 = map.put("A", "Bella");
    System.out.println("The key: " + key2); // Abby
    // return value Abby means, Abby has replaced by the new key, and value.

    // print out map
    System.out.println(map); // {A=Bella}

    map.put("B", "Bella");
    map.put("C", "Cath");
    map.put("D", "Danielle");
    System.out.println(map); // {A=Bella, B=Bella, C=Cath, D=Danielle}
    // result shows that the values can be duplicated. there is two Bella values
  }

}
