package org.javabasic.practices.classes;

/*
  an Author Class:
    Fields (Instance Variables)
      id
      name
    
    Non-Parameterized Constructor

    Parameterized Constructor

    Instance Methods:
      void showInfo()
*/
public class Author {
  // fields
  int id;
  String name;

  public Author() {
    this.id = 001;
    this.name = "Kai";
  }

  public Author(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public void showInfo() {
    System.out.println("Author ID: " + this.id + " Author Name: " + this.name);
  }
}
