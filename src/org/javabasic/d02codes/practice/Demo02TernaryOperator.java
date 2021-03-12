package org.javabasic.d02codes.practice;

/*
  Demo of determining whether number EVEN or ODD.
*/
public class Demo02TernaryOperator {
  public static void main(String[] args) {
    String result = 20 % 2 == 0 ? "number is EVEN" : "number is ODD";
    System.out.println(result);
  }
}
