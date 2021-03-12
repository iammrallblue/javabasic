package org.javabasic.d16codes;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
  Class Throwable:
    The Throwable class is the superclass of all errors and
    exceptions in the Java language.
  
  Three common methods of Class Throwable:
    public String getMessage():
      Returns the detail message string of this throwable.
    
    public String toString() {
      String s = getClass().getName();
      String message = getLocalizedMessage();
      return (message != null) ? (s + ": " + message) : s;
    } // Returns a short description of this throwable.
    public void printStackTrace()
      Prints this throwable and its backtrace to the standard error stream.
*/
public class Demo07ClassThrowable {
  /** . */
  public static void main(String[] args) {
    try {
      checkFile("1.txt");
    } catch (IOException e) {
      // System.out.println(e.getMessage());
      // System.out.println(e.toString()); // java.io.FileNotFoundException: path is
      // invalid.

      // method printStackTrace()
      e.printStackTrace();
      /*
       * java.io.FileNotFoundException: path is invalid. at
       * org.javabasic.d16codes.Demo07ClassThrowable.checkFile(Demo07ClassThrowable.
       * java:41) at
       * org.javabasic.d16codes.Demo07ClassThrowable.main(Demo07ClassThrowable.java:
       * 27)
       */
    }
  } // main

  /** method to check file's path and type. */
  public static void checkFile(String fileName) throws IOException {
    // check file's path
    if (!fileName.equals("tmp.txt")) {
      throw new FileNotFoundException("path is invalid.");
    }
    // check file's type
    if (!fileName.endsWith(".txt")) {
      throw new IOException("file type is incorrect.");
    } else {
      System.out.println("file is read");
    }
  }
}
