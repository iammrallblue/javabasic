package org.javabasic.d06codes.demo02;

/*
  When using Reference type as return value:
    the return value is just the memory hashcode.
*/
public class Demo05PhoneReturn {
  /** object of Phone Class used as return value. */
  public static void main(String[] args) {
    // object phoneTwo calls method getPhone()
    Phone phoneTwo = getPhone(); // getPhone() has the mem address @515f550a then assign to phoneTwo
    System.out.println(phoneTwo.brand); // Apple
    System.out.println(phoneTwo.price); // 999.99
    System.out.println(phoneTwo.color); // Gold
  } // main

  /**
   * Class Phone can be a return type, getPhone() received object phone which is
   * memory hashcode.
   */
  public static Phone getPhone() {
    Phone phone = new Phone();
    phone.brand = "Apple";
    phone.price = 999.99;
    phone.color = "Gold";
    System.out.println("Memory Address: " + phone.toString()); // @515f550a
    return phone; // phone is memory hashcode
  }
}