package org.javabasic.d06codes.demo02;

/*
  Demo of two phone objects:
    phone and phone2 use same memory hashcode.
    when object phone2 is created, it received memory hashcode from object phone.
*/
public class Demo05Phone {
  /** two Phone objects, assign first object value to second object. */
  public static void main(String[] args) {
    Phone phone = new Phone();
    System.out.println(phone.brand); // null
    System.out.println(phone.price); // 0.0
    System.out.println(phone.color); // null
    phone.brand = "Apple";
    phone.price = 999.99;
    phone.color = "Space Gray";
    System.out.println(phone.brand); // Apple
    System.out.println(phone.price); // 999.99
    System.out.println(phone.color); // Space Gray

    System.out.println("Second Phone Object. it received value from first object.");

    Phone phone2 = phone;
    System.out.println(phone2.brand); // Apple
    System.out.println(phone2.price); // 999.99
    System.out.println(phone2.color); // Space Gray
    phone2.brand = "Motorola";
    phone2.price = 599.99;
    phone2.color = "Green";
    System.out.println(phone2.brand); // Motorola
    System.out.println(phone2.price); // 599.99
    System.out.println(phone2.color); // Green
  }
}
