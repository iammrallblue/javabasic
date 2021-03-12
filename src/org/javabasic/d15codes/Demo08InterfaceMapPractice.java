package org.javabasic.d15codes;

import java.util.HashMap;
import java.util.Scanner;

/*
  Practice:
    Example counts the number of occurrences of character in a String.

  Steps:
    1. Scanner to get a String.
    2. Create Map collection, key is character in the String, 
        value is number of characters.
    3. iterating the String, to get each character.
    4. Using obtained character, to compare existed character (key) to check 
        if character existed or not.
        if Key existed:
          to get value by using key.
          then value++
          put(key, value) to store new elements to map collection.
        if Key is not existed:
          put(key, 1);
    5. iterating the map collection, print out the stored keys, and values.
*/
public class Demo08InterfaceMapPractice {
  /** . */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("requiring a String: ");
    String str = scanner.next();

    // object of Interface Map<K,V> K is Character, V is number of Character
    HashMap<Character, Integer> map = new HashMap<>();

    // iterating the String, to get each Character
    for (char c : str.toCharArray()) {
      // to check if character existed
      if (map.containsKey(c)) {
        // key existed
        Integer value = map.get(c);
        value++;
        map.put(c, value);
      } else {
        // key does not existed
        map.put(c, 1);
      }
    }

    // iterating all keys, and values
    for (Character key : map.keySet()) {
      Integer value = map.get(key);
      System.out.println(key + " is appeared: " + value);
    }
    scanner.close();
  } // main
}
