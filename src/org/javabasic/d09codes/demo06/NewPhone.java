package org.javabasic.d09codes.demo06;

/*
  A Subclass Named NewPhone.
  it is the next generation mobile phone, but used Phone as the Superclass.
  it has some new features, better than the Class Phone

  based on the requirement, we can override the method from Class Phone (Superclass)
  to void the duplicate methods.
*/
public class NewPhone extends Phone {
  
  @Override
  public void display() {
    super.display(); // make code less and efficient 
    // System.out.println("Showing number...");
    System.out.println("Showing name...");
    System.out.println("Showing avatar...");
  }
}
