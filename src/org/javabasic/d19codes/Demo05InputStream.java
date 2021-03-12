package org.javabasic.d19codes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    java.io.InputStream: (a Superclass)
    public abstract class InputStream:
      This abstract class is the superclass of all classes representing
      an input stream of bytes.
    methods of Class InputSteam:
      public int read(byte b[]) throws IOException
        Reads up to b.length bytes of data from this input
        stream into an array of bytes. This method blocks until some input
        is available.

    Constructors of Class String:
      public String​(byte[] bytes)
        convert byte to String.
      public String​(byte[] bytes,int offset,int length)
        int offset: the index of first byte to decode
        int length: the number of bytes to decode.
        convert partial byte to String...

*/
public class Demo05InputStream {
  /**
   * .
   */
  public static void main(String[] args) throws IOException {
    // object of FileInputStream to load the file in disk.
    FileInputStream fis = new FileInputStream("tmp.txt");

    // calling read(byte b[]) to read specific amount data from the file
    byte[] bytes = new byte[2]; // specific amount 2
    int length = fis.read(bytes);
    System.out.println(length); // directly print out length which is 2
    // using Arrays.toString() to iterate the array bytes
    System.out.println(Arrays.toString(bytes)); // [104, 101]
    System.out.println(new String(bytes)); // bytes to String, printout he

    // System.out.println(new String(bytes, offset, length));
    // offset the index of first char, length the number of chars.
    byte[] bytes2 = new byte[1024];
    int length2 = 0;
    while ((length2 = fis.read(bytes2)) != -1) {
      System.out.println(new String(bytes2, 0, length2)); // llo,bella.
    }

    // release fis
    fis.close();

  } // main
}
