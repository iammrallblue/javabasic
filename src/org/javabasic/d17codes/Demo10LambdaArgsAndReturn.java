package org.javabasic.d17codes;

import java.util.Arrays;
// import java.util.Comparator;

/*
  Lambda Expression w args and return value.
   1. declare Person[] Array to store a couple objects of Class Person
   2. to sort objects in the Array. ascending and descending.
*/
public class Demo10LambdaArgsAndReturn {
  /** . */
  public static void main(String[] args) {
    // Array for storing objects of Class Person
    Person[] person = { new Person("Abby", 12), new Person("Bell", 25), new Person("Cath", 20), };
    for (int i = 0; i < person.length; i++) {
      System.out.println(person[i]);
    }

    // Arrays.sort()
    // Arrays.sort(person, new Comparator<Person>(){

    // @Override
    // public int compare(Person o1, Person o2) {
    // return o1.getAge() - o2.getAge();
    // }
    // });

    // by lambda, the lambda with args and return value.
    Arrays.sort(person, (Person o1, Person o2) -> {
      return o1.getAge() - o2.getAge();
    });

    // by optimized lambda expression
    System.out.println("Optimized lambda expression.");
    Arrays.sort(person, (o1, o2) -> o1.getAge() - o2.getAge());
    // iterating Array person,
    for (Person person2 : person) {
      System.out.println(person2);
    }

  } // main
}
