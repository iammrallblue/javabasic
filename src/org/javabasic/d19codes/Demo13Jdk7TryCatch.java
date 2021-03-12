package org.javabasic.d19codes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
  New feature started from JDK7:
    try... keyword can following with (code block)
      Format:
        try (obj1 of InputStream; obj2 of InputStream; ...) {
          // codes mighgt occur error and exception
        } catch (IOException e) {
          // handling error and exception logic
        }
*/
public class Demo13Jdk7TryCatch {
  /** program is reading from tmp.txt, then writing into tmp2.txt. */
  public static void main(String[] args) {
    // the code inside of try()
    try (FileInputStream fis = new FileInputStream("tmp.txt");
        FileOutputStream fos = new FileOutputStream("tmp2.txt");) {

      // read and write data byte by byte
      // code block might have exception or error.
      int length = 0;
      while ((length = fis.read()) != -1) {
        fos.write(length);
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  } // main
}
