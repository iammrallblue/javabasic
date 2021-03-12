package org.javabasic.d02codes;

import java.util.Scanner;

/*
  Scanner Class Example:
    to input pets information, and print out
    name
    age
    breed
    father
    mother
    breeding
    weight

*/
public class Demo16Scanner {
  /** input information, print out information. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please Input Pet's Name: ");
    String name = scanner.next();
    System.out.print("Input Pet's Age: ");
    int age = scanner.nextInt();
    System.out.print("Input Pet's breed: ");
    String breed = scanner.next();
    System.out.print("Input Pet's Male Owner: ");
    String father = scanner.next();
    System.out.print("Input Pet's Female Owner: ");
    String mother = scanner.next();
    System.out.print("Input Pet's weight: ");
    double weight = scanner.nextDouble();
    System.out.print("Is the Dog Breeding Yet? <true: bred, false: not breed.");
    boolean breeding = scanner.hasNextBoolean();

    // to show pet's information:
    System.out.println(name + "'s information: ");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Breed: " + breed);
    System.out.println("Weight: " + weight + "lb");
    System.out.println("Male Owner: " + father);
    System.out.println("Female Owner: " + mother);
    System.out.println("Breeding yet?" + breeding);

    scanner.close();
  } // main
}
