package org.javabasic.d01codes.demo02;

/*
  Integer Demo:
    int3 == int4, because it is exceeded (-127 ~ 128), 
    Buffer will create an new object, therefore, their memory hashcode are different
    the result will be false.
*/
public class Demo04Integer {
  /** Integer Demo. */
  public static void main(String[] args) {
    Integer int1 = 10;
    Integer int2 = 10;
    Integer int3 = 200;
    Integer int4 = 200; // exceeded -127 ~ 128 (IntegerCache method),
    Integer int5 = new Integer(10);
    System.out.println(int1 == int2); // true
    System.out.println(int1 == int5); // false
    System.out.println(int3 == int4); // false
    Object obj = int3.getClass();
    System.out.println(obj);
  } // main
}
