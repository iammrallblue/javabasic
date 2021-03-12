package org.javabasic.d11codes.demo03;

public class Demo04InnerClass {

  /** . */
  public static void main(String[] args) {
    // directly create an object of InnerClass.
    OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
    innerClass.innerMethod(); // 30 20 10
  } // main
}
