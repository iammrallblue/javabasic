package org.javabasic.d18codes;

import java.io.File;

/*
  Methods in Class File:
    public String[] list()
      Returns an array of strings naming the files and directories in the
      directory denoted by this abstract pathname.
    public File[] listFiles()
      Returns an array of abstract pathnames denoting the files in the
      directory denoted by this abstract pathname.
    NOTICE:
      method list() and listFiles() are iterating all files and directories 
      in the constructors.
      If constructor doesn't contain files and directories, it will throw NullPointerException
 */
public class Demo06MethodInClassFile {
  /** . */
  public static void main(String[] args) {
    method1();
    method2();
  } // main

  // method listFiles()
  private static void method2() {
    File file = new File("/Users/junoh/Workspace/javabasic");
    File[] files = file.listFiles();
    for (File allFiles : files) {
      System.out.println(allFiles);
    }
  }

  // method list() return String[]
  private static void method1() {
    File file = new File("/Users/junoh/Workspace/javabasic/src");
    String[] array = file.list();
    for (String fileName : array) {
      System.out.println(fileName);
    }
  }
}