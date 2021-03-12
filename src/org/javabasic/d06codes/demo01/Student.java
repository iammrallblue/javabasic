package org.javabasic.d06codes.demo01;

/*
  How to declare a Student Class:
    Two parts:
      Attributes:
        Fields of a class represent properties (also called attributes) of objects of that class
        Instance Fields (Instance Variables):
        Class Fields (usually with static):
      Behavior:
        A method in a class defines the behavior of the objects of that class
        or the behavior of the class itself
        Instance Methods:
      
    NOTICE:
      1. Instance variable directly defines in the Class, outside of the method.
      2. Instance method does not have keyword "static".
  */
public class Student {

  // Fields, instance variables
  String name;
  int age;

  // Instance methods
  public void eat() {
    System.out.println("foodie, food lover");
  }

  public void sweet() {
    System.out.println("sweet tooth");
  }

  public void drink() {
    System.out.println("big drinker.");
  }

  public void sleep() {
    System.out.println("cat nap ");
  }
}