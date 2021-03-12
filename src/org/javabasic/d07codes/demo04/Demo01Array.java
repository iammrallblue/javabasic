package org.javabasic.d07codes.demo04;

/*
  Person Class:
    public class Person {
      (see detail in Person.java)
    }
  Key point:
    1. declare a Person type Array to store object of Class Person.
        format:
          Person[] array = new Person[3];

    2. Cons of Array: the length cannot change during programing executing
*/
public class Demo01Array {
  /** Demo of Person type Array. */
  public static void main(String[] args) {
    // declare the array for storing objects of Person
    Person[] array = new Person[3]; // Array length is fixed.
    System.out.println("index [0] is: " + array[0]); // default value null
    System.out.println("memory hashcode of the array is: " + array); // 2a139a55

    // storing memory hashcode to array
    array[0] = new Person("Abby", 15);
    Person person = new Person("Bella", 16);
    array[1] = person;
    Person person2 = new Person("Cathy", 17);
    array[2] = person2;

    // print out memory hashcode of all elements.
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    // print out elements from array
    int count = 1;
    for (int j = 0; j < array.length; j++) {
      System.out.println("the " + count + " student is: " + array[j].getName());
      System.out.println(array[j].getAge() + " years old.");
      count++;
    }

  } // main
}