package org.javabasic.d16codes;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
  try...catch:
    second method to handle Exceptions, try...catch will solve exceptions itself, 
    not throwing to JVM.
    Format:
      try {
        // here is located the code which might have exceptions.
      } catch (Exception e) {
        // exception-processing logic, to solve the exception.
      }
    NOTICE:
      1. try might have more than one objects of exceptions, therefore,
          need to have more than one catch to handle those objects.
      2. If try does not have any objects of exceptions,then catch will be skipped to next.
*/
public class Demo06TryCatch {
  /** instance of try...catch . */
  public static void main(String[] args) {
    try {
      checkPath("tmp.tx");
    } catch (IOException e) {
      System.out.println("File Error.");
    }

    System.out.println("Finish.");
  } // main

  private static void checkPath(String fileName) throws IOException {
    // check file's path
    if (!fileName.equals("tmp.txt")) {
      throw new FileNotFoundException("path is invalid.");
    }
    if (!fileName.endsWith(".txt")) {
      throw new IOException("File type is NOT correct.");
    } else {
      System.out.println("File is read.");
    }
  }
}
