package org.javabasic.practices.classes;

/*
  A Book Class:
    Fields:
      id
      name
      price
      amount
      publisher
      author
    Instance method:
      bookInfo()
*/
public class Book {
  // fields
  int id;
  String name;
  double retailPrice;
  int quantity;
  String publisher;
  String author;

  /** non-parameterized constructor. */
  public Book() {
    id = 0001;
    name = "Hall";
    retailPrice = 20.99;
    quantity = 999;
  }

  /** parameterized constructor. */
  public Book(int id, String name, double retailPrice, int quantity, String publisher, String author) {
    this.id = id;
    this.name = name;
    this.retailPrice = retailPrice;
    this.quantity = quantity;
  }

  /** a method show detail of book. */
  public void bookInfo() {
    System.out.println("Book ID: " + "\tName: " + name);
    System.out.println("Price: " + retailPrice + "\tQuantity: " + quantity);
    System.out.println("Publisher: " + publisher + "\tAuthor: " + author);
  }
}
