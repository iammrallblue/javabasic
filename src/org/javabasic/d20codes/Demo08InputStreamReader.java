package org.javabasic.d20codes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  java.io.InputStreamReader:
    public class InputStreamReader extends Reader:
      An InputStreamReader is a bridge from byte streams to character streams.
      reads bytes and decodes them into characters using a specified charset.
      Methods inherited from class java.io.Reader:
        public int read()
          Reads a single character
        public int read(char cbuf[], int offset, int length)
          Reads characters into a portion of an array
        public void close()
      Constructors:
        public InputStreamReader(InputStream in)
          Creates an InputStreamReader that uses the default charset
        public InputStreamReader(InputStream in, String charsetName)
          Creates an InputStreamReader that uses the named charset
        Parameters:
          InputStream in, reads bytes of a file.
          String charsetName, specifies the charset, utf-8, gbk...

 */
public class Demo08InputStreamReader {
  public static void main(String[] args) throws IOException {
    method();
    method2();
  } // main

  // reads gbk file by Class InputStreamReader
  private static void method2() throws IOException {
    InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"), "GBK");

    int length = 0;
    while ((length = isr.read()) != -1) {
      System.out.print(length);
    }

    isr.close();
  }

  // reads utf-8 file by Class InputStreamReader
  private static void method() throws IOException {
    InputStreamReader isr = new InputStreamReader(new FileInputStream("utf8.txt"), "UTF-8");

    // reading content
    int length = 0;
    while ((length = isr.read()) != -1) {
      // System.out.println(length); // result in sets of numbers
      System.out.print((char) length); // Hello,Bella
    }

    isr.close();
  }
}
