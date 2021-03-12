package org.javabasic.d18codes;

import java.io.File;

/*
  Constructors of Class File:
    public File(String pathname):
      Creates a new File instance by converting the given
      pathname string into an abstract pathname.  If the given string is
      the empty string, then the result is the empty abstract pathname.
    public File(String parent, String child):
      Creates a new File instance from a parent pathname string
      and a child pathname string.
      separate the parent path and child path. flexible 
    public File(File parent, String child)
      Creates a new File instance from a parent abstract pathname and a child pathname string.
*/
public class Demo02ClassFileConstructor {
  /** . */
  public static void main(String[] args) {
    method();
    method2(".//", "tmp.txt");
    method3();
  } // main

  // File(File parent, String child)
  private static void method3() {
    File fileParent = new File(".//");
    File file = new File(fileParent, "tmp.txt");
    System.out.println(file);

  }

  // File(String parent, String child)
  private static void method2(String parent, String child) {
    File file = new File(parent, child);
    System.out.println(file);
  }

  // File(String pathname)
  private static void method() {
    File file = new File(".//tmp.txt");
    System.out.println(file); // override method toString(), print out the path.
  }
}
