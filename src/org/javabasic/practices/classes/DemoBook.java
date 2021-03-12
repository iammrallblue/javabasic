package org.javabasic.practices.classes;

/*
  Demo of Book Class:

*/
public class DemoBook {
  /** Demo of Book Class. */
  public static void main(String[] args) {
    Book book1 = new Book();
    book1.bookInfo();

    Book book2 = new Book(002, "book2", 99.99, 10000, "book company", "Bella");
    book2.bookInfo();
  } // main
}
