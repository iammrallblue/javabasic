package org.javabasic.d06codes.demo02;

/*
  Demo of Two objects of Phone Class.
*/
public class Demo04Phone {
  /** Demo of two objects of Phone Class. */
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

    System.out.println("Second Phone Object.");

    Phone phone2 = new Phone();
    System.out.println(phone2.brand); // null
    System.out.println(phone2.price); // 0.0
    System.out.println(phone2.color); // null
    phone2.brand = "Motorola";
    phone2.price = 599.99;
    phone2.color = "Green";
    System.out.println(phone2.brand); // Motorola
    System.out.println(phone2.price); // 599.99
    System.out.println(phone2.color); // Green
  } // main
}
