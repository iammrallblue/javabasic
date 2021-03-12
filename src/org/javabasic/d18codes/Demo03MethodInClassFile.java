package org.javabasic.d18codes;

import java.io.File;

/*
  Methods in Class File:
    public String getAbsolutePath():
      Returns the absolute pathname string of this abstract pathname.
    public String getPath():
      Converts this abstract pathname into a pathname string.
    public String getName():
      Returns the name of the file or directory denoted by this abstract pathname.
    public long length():
      Returns the length of the file denoted by this abstract pathname.
      The return value is unspecified if this pathname denotes a directory.
    NOTICE:
      method toString() of Class File invokes the method getPath()
       public String toString() {
        return getPath();
    }
*/
public class Demo03MethodInClassFile {
  /** . */
  public static void main(String[] args) {
    method1();
    method2();
    method3();
    method4();
  } // main

  // public long length():
  private static void method4() {
    File file = new File("/Users/junoh/Workspace/javabasic/falcons.jpg");
    long length = file.length();
    System.out.println(length);
    String absPath = file.getAbsolutePath();
    System.out.println(absPath);
  }

  // public String getName():
  private static void method3() {
    File file = new File("~//Workspace//javabasic//tmp.txt");
    String name = file.getName();
    System.out.println(name); // tmp.txt

    File file2 = new File("//Workspace//javabasic");
    String name2 = file2.getName();
    System.out.println(name2); // javabasic

  }

  // public String getPath():
  private static void method2() {
    File file = new File("~//Workspace//javabasic//tmp.txt");
    File file2 = new File("tmp.txt");
    String path1 = file.getPath();
    System.out.println(path1); // ~/Workspace/javabasic/tmp.txt
    String path2 = file2.getPath();
    System.out.println(path2); // tmp.txt
    System.out.println(file.toString()); // print out the path ~/Workspace/javabasic/tmp.txt
  }

  // public String getAbsolutePath()
  private static void method1() {
    File file = new File("~//Workspace//javabasic//tmp.txt");
    String absPath = file.getAbsolutePath();
    System.out.println(absPath);

    File file2 = new File("tmp.txt");
    String absPath2 = file2.getAbsolutePath();
    System.out.println(absPath2); // Users/junoh/Workspace/javabasic/tmp.txt
  }
}
