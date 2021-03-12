package org.javabasic.d16codes;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
  Keyword Throws:
    ** Diffs from keyword throw
    one of methods to handle Exceptions. always referred exception to the method
    which calls exception method. finally, JVM will solve the exception.

    Usage:
      throws is always behind the declared method.
    Format:
      public static void method() throws {
        throw new xxxException("message");
        throw new yyyException("message");
      }
    NOTICE:
      1. keyword throws MUST follows the declared method.
      2. keyword throws MUST collocate with Exceptions or its Subclass, NOT Errors.
    
      ** FileNotFoundException extends IOException, Don't need to declare both sometimes.
      (See below.s)
*/
public class Demo05KeywordThrows {
  public static void main(String[] args) throws IOException {
    checkPath("tmp.txt");
  } // main

  /**
   * method to determine that if paths are invalid. if invalid, throws Exception.
   */
  public static void checkPath(String fileName) throws FileNotFoundException, IOException {
    if (!fileName.equals("tmp.txt")) {
      throw new FileNotFoundException("path is invalid. ");
    }

    // check file types
    if (!fileName.endsWith(".txt")) {
      throw new IOException("File Type Error.");
    }

    System.out.println("Path is valid, File type is correct.");
  }
}
