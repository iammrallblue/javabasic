package org.javabasic.practices.classes;

/*
  Demo of Author Class:

*/
public class DemoAuthor {
  /** Demo of Author Class. */
  public static void main(String[] args) {
    Author author = new Author();
    System.out.println(author);
    author.showInfo();

    Author author2 = new Author(002, "Bella");
    System.out.println(author2);
    author2.showInfo();
  } // main
}
