package org.javabasic.d15codes;

import java.util.HashMap;
import java.util.Hashtable;

/*
  Class Hashtable<K,V>:
    public class Hashtable<K,V> implements Map<K,V>
      This class implements a hash table, which maps keys to values. 
      Any non-null object can be used as a key or as a value.

    Hashtable: based on hash table, synchronized, thread-safe, not support null value, slow query
    Hashmap: based on hash table, not synchronized, multi-threads, support null vale, fast query.

    after JDK1.1, Hashtable and Vector have been replaced by Hashmap and ArrayList,
    however, Class Properties which is a Subclass of hashtable is still in using.
    Class Properties is the ONLY collection combined with the IO Stream.

*/
public class Demo07ClassHashTable {
  /** . */
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put(null, "a");
    map.put("b", null);
    map.put(null, null);
    System.out.println(map); // {null=null, b=null}, key can be duplicated

    Hashtable<String, String> table = new Hashtable<>();
    // table.put("a", null); // NullPointerException
    // table.put(null, "b"); // NullPointerException
    // table.put(null, null); // NullPointerException
    System.out.println(table);
    // the result indicated that Hashtable is NOT supported null values.
  } // main
}
