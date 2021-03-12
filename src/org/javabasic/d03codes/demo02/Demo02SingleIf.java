package org.javabasic.d03codes.demo02;

/*
  Processing Controls (2nd way)
    Selection Structure:
      1. If Statement (Single If)
            see the instance 
            if statement to determine someone is an adult or under age.
      2. If...Else Statement
          see Demo03IfElse.java
      3. If-Else... If-Else... Statement
        see Demo04IfElse.java
*/
public class Demo02SingleIf {
  /** Demo of Single if-statement. */
  public static void main(String[] args) {
    int age = 6;
    if (age >= 18) {
      System.out.println("You are an adult.");
    }
  } // main
}
