package org.javabasic.d15codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
  Storing self-defined data type by Class HashMap<K,V>
  public class HashMap<K,V> implements Map<K,V>:

  keys need to be unique, therefore two methods need to be overridden.
  method hashCode(), and equals();

*/
public class Demo05HashMap {
  public static void main(String[] args) {
    method();
    method2();
  } // main

  // HashMap<K,V> to store keys and values
  // keys set as Person(unique), values set as String
  private static void method2() {
    // object of Class HashMap<K,V>
    HashMap<Person, String> map = new HashMap<>();
    // put
    map.put(new Person("Abby", 20), "ATL");
    map.put(new Person("Bella", 16), "BOS");
    map.put(new Person("Cath", 18), "CHI");
    map.put(new Person("Bella", 16), "DEN");

    // iterating map collection by entrySet() and for/each statement
    Set<Map.Entry<Person, String>> set = map.entrySet();
    for (Map.Entry<Person, String> entry : set) {
      Person key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key + "-->" + value);

      // Person{Name: Bella, Age: 16}-->BOS
      // Person{Name: Bella, Age: 16}-->DEN
      // Person{Name: Abby, Age: 20}-->ATL
      // Person{Name: Cath, Age: 18}-->CHI
      // ** since Class Person is the key, we should make key unique.
      // keys should not be duplicated.

      // after override hashCode() and equals()
      // the result is :
      // Person{Name: Bella, Age: 16}-->DEN
      // Person{Name: Abby, Age: 20}-->ATL
      // Person{Name: Cath, Age: 18}-->CHI
    }
  }

  // HashMap<K,V> to store keys and values
  // keys set as String (unique), values set as Person (can be duplicated)
  // since Class String has been overridden hashCode() and equals(),
  private static void method() {
    // object of Class HashMap<K,V>.
    HashMap<String, Person> hashMap = new HashMap<>();
    // put()
    hashMap.put("ATL", new Person("Abby", 20));
    hashMap.put("BOS", new Person("Bella", 17));
    hashMap.put("CHI", new Person("Cath", 13));
    hashMap.put("DEN", new Person("Danielle", 16));

    // iterating hashmap collection by for/each statement
    Set<String> set = hashMap.keySet();
    for (String key : set) {
      Person value = hashMap.get(key);
      System.out.println(key + "-->" + value);
    }
  }
}
