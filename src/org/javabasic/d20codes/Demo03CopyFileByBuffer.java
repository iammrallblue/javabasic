package org.javabasic.d20codes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
  Example to show copy a file by bytes in Buffer
    to copy pic file "falcons.jpg" to another location.
        // 3. calling method read()
    // int length = 0;
    // while ((length = bis.read()) != -1) {
    // bos.write(length);
    // }
    // Elapsed time (ms): 24
  STEPS:
    1. Creates an object of FileInputStream to pass file.
    2.  
*/
public class Demo03CopyFileByBuffer {
  /** . */
  public static void main(String[] args) throws IOException {
    // time start
    long start = System.currentTimeMillis();
    // 1. object of BufferedInputStream
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("falcons.jpg"));
    // 2. object of BufferedOutputStream
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy_falcons.jpg"));

    // 3. using array to read file in Buffer
    byte[] bytes = new byte[1024];
    int length = 0;
    while ((length = bis.read(bytes)) != -1) {
      bos.write(bytes, 0, length);
    }
    // Elapsed time (ms): 1

    // calling method close()
    bos.close();
    bis.close();

    long end = System.currentTimeMillis();
    System.out.println("Elapsed time (ms): " + (end - start));

  } // main
}
