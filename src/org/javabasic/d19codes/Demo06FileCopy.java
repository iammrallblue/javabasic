package org.javabasic.d19codes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
  Example copying file by operating chars.

  Steps:
    1. create object of Class FileInputStream to locate and read
      the copying file
    2. create object of Class FileOutputStream to create and write the file.
    3. using method read() to read file
    4. using method write() to write data to new location.
    5. release fis and fos.

*/
public class Demo06FileCopy {
  /**
   * .
   */
  public static void main(String[] args) throws IOException {
    // 1.
    FileInputStream fis = new FileInputStream("falcons.jpg");
    // 2.
    FileOutputStream fos = new FileOutputStream("falcons_copy.jpg");

    // // 3. method read() to read file
    // int length = 0;
    // while ((length = fis.read()) != -1) {

    // // 4. method write() to a new file
    // fos.write(length);
    // }

    // step 3,4 can be optimized by Array buffer
    byte[] bytes = new byte[1024];
    // 3. read() to read file
    int length = 0;
    while ((length = fis.read(bytes)) != -1) {
      // 4. write() to write a new file
      fos.write(bytes, 0, length);
    }
    // 5. release fos and fis
    fos.close();
    fis.close();
  } // main
}
