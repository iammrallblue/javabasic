package org.javabasic.d12codes;

import java.util.ArrayList;

/*
    Autoboxing: (int --> Integer)
        Integer boxing = new Integer(1); or
        Integer boxing = 1; // cannot directly use it, b/c it's wrapper class. needs to unboxing.
    
    Unboxing: (Integer --> int)
        boxing + 2 is equal to boxing.intValue() + 3 = 3 // Unboxing 
        boxing = boxing + 3 is equal to boxing = new Integer(3) // Autoboxing

 */
public class Demo13AutoboxingAndUnboxing {
  /**.  */
  public static void main(String[] args) {

    Integer boxing = 1; // Autoboxing

    boxing = boxing + 2; // Unboxing first then Autoboxing
    System.out.println(boxing); // 3

    // the ArrayList<> cannot store int value, but can store int value as <Integer>
    // Wrapper Class
    ArrayList<Integer> list = new ArrayList<>();
    list.add(4); // Autoboxing, is equal to list.add(new Integer(4));

    // Unboxing, is equal to list.get(0).intValue();
    int unboxing = list.get(0);
    System.out.println(unboxing); // 4
  } // main
}