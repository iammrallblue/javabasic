package org.javabasic.d17codes;

import java.util.ArrayList;

public class Demo12Lambda {
  /** . */
  public static void main(String[] args) {
    // before JDK1.7, generic type <String> must be in both side.
    ArrayList<String> array = new ArrayList<String>();
    System.out.println(array);

    // after JDK1.7, generic type <String> can ONLY in left side.
    ArrayList<Integer> array2 = new ArrayList<>();
    System.out.println(array2);
    // the generic type on the right side can be derived, when left side
    // generic type defined.
  } // main
}
