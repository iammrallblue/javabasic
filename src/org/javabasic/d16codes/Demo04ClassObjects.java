package org.javabasic.d16codes;

import java.util.Objects;

/*
  Class Objects:
    public static <T> T requireNonNull(T obj) {
          if (obj == null)
              throw new NullPointerException();
          return obj;
    }
    Checks that the specified object reference is not null. This
    method is designed primarily for doing parameter validation in methods
    and constructors.
*/
public class Demo04ClassObjects {
  public static void main(String[] args) {
    method(null);
    // java.lang.NullPointerException: object's value is null.
  } // main

  /** . */
  public static void method(Object obj) {
    // if statement to determine if object is null.
    // if (obj == null) {
    // throw new NullPointerException("object's value is null.");
    // }

    // using method requireNonNull(T obj)
    Objects.requireNonNull(obj);
    // result same as above, java.lang.NullPointerException
    Objects.requireNonNull(obj, "Object Cannot be null.");
  }
}
