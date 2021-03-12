package org.javabasic.d05codes;

/*
  For test classes:
    1. Computer.java
    2. Dog.java
*/
public class Demo14ClassesTest {
  /** Test Classes. */
  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.showSpec();

    // Dog dog = new Dog();
    Dog dog; // data type is Dog, dog is a local variable (in method).
    dog = new Dog();
    dog.method2();
    dog.dogInfo();

    dog.setAge(4);
    System.out.println("oovo's age: " + dog.getAge());

    // call a static method
    Dog.method3();

    Dog dog2 = new Dog("Husky", 3, "Buggy", "Black");
    dog2.dogInfo();

    dog2 = null;
    // dog2.dogInfo(); // java.lang.NullPointerException

    // to void NullPointerException
    dog2 = new Dog("Bulldog", 3, "Bull", "suntan");
    dog2.dogInfo();
  } // main
}
