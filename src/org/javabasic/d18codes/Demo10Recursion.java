package org.javabasic.d18codes;

import java.io.File;

/*
  Print out multi-level directory by recursion.
*/
public class Demo10Recursion {
  public static void main(String[] args) {
    File file = new File("/Users/junoh/Workspace/javabasic/");
    printDirectory(file);
  } // main

  /** method for passing File type (directory) argument. */
  // iterating directory in method body
  public static void printDirectory(File directory) {
    File[] files = directory.listFiles();
    for (File file : files) {
      if (file.isDirectory()) {
        printDirectory(file);
      } else {
        System.out.println(file);
      }
    }
  }
}
