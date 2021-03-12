package org.javabasic.d09codes.demo06;

/*
  Key point:
    when to use Override.
      A principle of thought of programing,
      don't rewriting any declared methods
      using override to "update" a method 
      which needs to be adding new features.
*/
public class Demo06Phone {
  /** Demo of Override a Method. */
  public static void main(String[] args) {
    // an object of Class Phone
    Phone phone = new Phone();
    phone.call();
    phone.message();
    phone.display();
    System.out.println("above is an old phone, only has three main features.");

    System.out.println("below is an new phone, updated one main feature.");
    NewPhone newPhone = new NewPhone();
    newPhone.call(); // inherited from the Superclass
    newPhone.message(); // ditto.
    newPhone.display(); // it has overridden in the Subclass.
  } // main
}
