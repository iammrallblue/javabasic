package org.javabasic.d06codes.demo02;

/*
    Create a Phone Class.
      fields, instance variables:
        String brand;
        double price;
        String color;
      instance methods:
        void call();
        void sendMessage();
*/
public class Phone {
  // instance variables
  String brand;
  double price;
  String color;

  // instance methods
  public void call(String who) {
    System.out.println("Calling.." + who);
  }

  public void sendMessage() {
    System.out.println("Posting message.");
  }
}