package org.javabasic.d18codes;

import java.io.File;
import java.io.IOException;

/*
  Methods in Class File:
    public boolean createNewFile() throws IOException
      Atomically creates a new, empty file named by this abstract pathname if
      and only if a file with this name does not yet exist.
      NOTICE:
        1. ONLY can create file, not directory
        2. the path for creating file MUST be existed, otherwise, IOException
    public boolean delete()
      Deletes the file or directory denoted by this abstract pathname.
      NOTICE:

    public boolean mkdir()
      Creates the directory named by this abstract pathname. (empty directory)
    public boolean mkdirs()
      Creates the directory named by this abstract pathname, including any
      necessary but nonexistent parent directories. (empty directory)
*/
public class Demo05MethodInClassFile {
  /**
   * .
   */
  public static void main(String[] args) throws IOException {
    method1();
    method2();
    method3();
  } // main

  // method delete() deleting file and directory both.
  private static void method3() {
    File file = new File("temp.txt"); // delete temp.txt file.
    boolean isDeleted = file.delete();
    System.out.println("Delete? " + isDeleted); // true

    File file2 = new File("/Users/junoh/Workspace/javabasic/bella.jpg");
    boolean isDeleted2 = file2.delete();
    System.out.println("Delete? " + isDeleted2); // true.

    File file3 = new File("/Users/junoh/Workspace/javabasic/doc/11/22/");
    boolean isDeleted3 = file3.delete();
    System.out.println("Delete? " + isDeleted3);
  }

  // method mkdir() and mkdirs()
  private static void method2() {
    File file = new File("/Users/junoh/Workspace/javabasic/doc");
    boolean folder = file.mkdir();
    System.out.println("Is directory created? " + folder); // true

    File file2 = new File("/Users/junoh/Workspace/javabasic/doc/11/22/33");
    boolean folders = file2.mkdirs();
    System.out.println("Is directory created? " + folders); // true
  }

  // method createNewFile(),
  // return true, there is no file under the denoted name and created it
  // return false there exists file by denoted name.
  private static void method1() throws IOException {
    File file = new File("/Users/junoh/Workspace/javabasic/temp.txt");
    boolean isCreated = file.createNewFile();
    System.out.println("Is file created? " + isCreated); // true, (not exist and create.)

    // File file2 = new File("bella.jpg"); // using relative path
    // boolean isCreated2 = file2.createNewFile();
    // System.out.println("Is file created? " + isCreated2);
    // String path = file2.getAbsolutePath();
    // System.out.println(path);
    // the file created under the path
    // /Users/junoh/Workspace/javabasic/bella.jpg

  }
}
