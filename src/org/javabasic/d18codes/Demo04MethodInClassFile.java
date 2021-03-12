package org.javabasic.d18codes;

import java.io.File;

/*
  Methods in Class File:
    public boolean exists() 
      Tests whether the file or directory denoted by this abstract pathname exists.
    public boolean isDirectory()
      Tests whether the file denoted by this abstract pathname is a directory.
    public boolean isFile()
      Tests whether the file denoted by this abstract pathname is a normal file.
*/
public class Demo04MethodInClassFile {
  /** . */
  public static void main(String[] args) {
    method1();
    method2();
  } // main

  // public boolean isDirectory() and isFile()
  private static void method2() {
    File file = new File("/Users/junoh/Workspace/javabasic");
    System.out.println("Is a Directory? " + file.isDirectory()); // true, it is a directory
    System.out.println("Is a File? " + file.isFile()); // false.

  }

  // public boolean exists()
  private static void method1() {
    // File file = new File("/Users/junoh/Workspace/javabasic/tmp.txt"); // true
    // File file = new File("//Users//junoh//Workspace//javabasic//tmp.txt"); //
    // true
    // File file = new File("tmp.txt"); // true
    File file = new File("/Users/junoh/Workspace/javabasic/tmp.txt"); // true

    String path = file.getAbsolutePath();
    System.out.println(path); // absolute path
    // method exists() to determine if file or directory existed.
    boolean isExist = file.exists();
    System.out.println("File or Directory is existed: " + isExist);
  }
}
