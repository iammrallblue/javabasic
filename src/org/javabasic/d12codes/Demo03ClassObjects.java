package org.javabasic.d12codes;

import java.util.Objects;

/*
    java.util
    Class Objects, Objects extends from Class Object
    Format:
        public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }
    Expansion:
        1. returns true if both arguments are equal.
        2. returns false if a == null,
    NOTICE:
            1. null value CANNOT invoke any methods, therefore when str3 is assigned a null value
                the equals() shows ERROR java.lang.NullPointerException
            2. Solve: Objects.equals(Obj1, Obj2) {}
                can compare any objects transmitted in.

*/
public class Demo03ClassObjects {
  /** . */
  public static void main(String[] args) {
    String str = "Abby";
    String str2 = "Bella";
    System.out.println(str);
    // 1st, call equals() to compare both object address in memory
    boolean value = str.equals(str2);
    System.out.println(value); // false, b/c address in memory is different.

    // if compare a string value with null value, ERROR
    // java.lang.NullPointerException
    String str3 = null;
    String str4 = "Danielle";
    // boolean value2 = str3.equals(str4); // ERROR java.lang.NullPointerException
    // System.out.println(value2);

    // Objects.equals(obj1,obj2) can accept a null value.
    boolean value3 = Objects.equals(str3, str4);
    System.out.println(value3); // false, NO NullPointerException ERROR.
  } // main
}
