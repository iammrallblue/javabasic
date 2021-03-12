package org.javabasic.d06codes.demo02;

/*
  Demo of using object as a parameter.
*/
public class Demo04PhoneParam {
  /** object of Phone used as a parameter. */
  public static void main(String[] args) {
    Phone phone = new Phone();
    // the object phone basically stored a memory hashcode
    phone.brand = "Apple";
    phone.price = 999.99;
    phone.color = "Gold";

    // phone is an object, can be a parameter for the method below
    // when the object phone is passing as a parameter,
    // it passes the memory hashcode to the method().
    method(phone);

  } // main

  /** param is assigned a memory address. */
  public static void method(Phone param) {
    System.out.println(param.brand); // Apple
    System.out.println(param.price); // 999.99
    System.out.println(param.color); // Gold
    param.call("Bella");
  }
}
