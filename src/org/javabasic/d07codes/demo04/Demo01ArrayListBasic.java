package org.javabasic.d07codes.demo04;

import java.util.ArrayList;

// ** ArrayList CAN be reference type, but if primitive type is required.
// we can use the primitive type's package class such as Integer, Boolean, Double etc.
/* 
  java.util.ArrayList<E>:

  Key Point:
    All wrapper classes located in java.lang
      Primitive type       Wrapper Class
          byte                Byte
          short               Short
          int                 Integer
          long                Long
          float               Float
          double              Double
          boolean             Boolean
          char                Character
        
    autoboxing Primitive type --> Wrapper Class
    autounboxing Wrapper class --> Primitive type
    above 1.5+ JDK
*/

public class Demo01ArrayListBasic {
  /** Demo of ArrayList<>. */
  public static void main(String[] args) {
    ArrayList<String> listA = new ArrayList<>();
    // String is reference type,
    System.out.println(listA); // []

    // ArrayList<int> listB = new ArrayList<>(); // ERROR, cannot use primitive type
    ArrayList<Integer> listB = new ArrayList<>(); 
    // MUST define the type as Wrapper class (Reference type)

    listB.add(200);
    listB.add(300);
    System.out.println(listB);

    int index = listB.get(0);
    System.out.println("The element is: " + index);
  }
}