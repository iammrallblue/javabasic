package org.javabasic.d06codes.demo02;

public class Demo03Phone {
  /** Demo of Phone Class. */
  public static void main(String[] args) {
    Phone phone = new Phone();
    System.out.println(phone.brand); // null 
    System.out.println(phone.price); // 0.0
    System.out.println(phone.color); // null

    System.out.println("----Assign values to instance variables and methods-------");

    // assign values to fields.
    phone.brand = "Apple";
    phone.price = 1299.99;
    phone.color = "Rose Gold";
    System.out.println(phone.brand); // Apple
    System.out.println(phone.price); // 1299.99
    System.out.println(phone.color); // Rose Gold
    phone.call("Jobs");
    phone.sendMessage();
  }
}