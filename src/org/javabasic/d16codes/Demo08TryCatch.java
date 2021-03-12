package org.javabasic.d16codes;

import java.util.LinkedList;
import java.util.List;

/*
  3 different methods to use try...catch
    1. multiple exceptions, processing separately. many try...catch
    2. one try for multiple exceptions, processing separately.
    3. one try for multiple exceptions, one catch for processing multiple exceptions.
*/
public class Demo08TryCatch {
  /** . */
  public static void main(String[] args) {
    method3();
  } // main

  /** . */
  public static void method1() {
    // 1. multiple exceptions, processing separately.
    try {
      int[] array = { 3, 2, 1 };
      System.out.println(array[5]); //
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e); // java.lang.ArrayIndexOutOfBoundsException: 5
    }
    try {
      List<Integer> list = new LinkedList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      System.out.println(list.get(8));
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e); // java.lang.IndexOutOfBoundsException: Index: 8, Size: 3
    }
    System.out.println("finish..");
  }

  /** . */
  public static void method2() {
    // 2.one try for multiple exceptions, more catch for processing separately.
    try {
      // int[] array = { 3, 2, 1 };
      // System.out.println(array[5]); //

      List<Integer> list = new LinkedList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      System.out.println(list.get(8));
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e); // java.lang.ArrayIndexOutOfBoundsException
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e); // java.lang.IndexOutOfBoundsException: Index: 8, Size: 3
    }
    /*
     * NOTICE: one try more catches. if object of exception inside catch brackets
     * has inheritance relationship, Subclass has to be replaced on the top. for
     * instance, class ArrayIndexOutOfBoundsException extends
     * IndexOutOfBoundsException therefore, ArrayIndexOutOfBoundsException has to be
     * top of IndexOutOfBoundsException
     */
  }

  /** . */
  public static void method3() {
    // 3. one try for multiple exceptions, one catch for processing multiple
    // exceptions.
    try {
      int[] array = { 3, 2, 1 };
      System.out.println(array[5]); //

      List<Integer> list = new LinkedList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      System.out.println(list.get(9));
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
