package org.javabasic.d20codes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
  java.io.BufferedInputStream;
    Class BufferedInputStream extends FilterInputStream
      A BufferedInputStream adds functionality to another input stream-namely,
    Methods inherited from Superclass InputStream:
      public int read()
        Reads the next byte of data from the input stream. the value byte is
        returned as an int in the range 0 to 244.
      public int read(byte b[], int off, int len)
        Reads up to len bytes of data from the input stream into an array of bytes.
        an attempt is made to read as many as len bytes.
      public void close()
        Closes this input stream and releases any system resources associated
        with the stream.
    Constructors:
      public BufferedInputStream(InputStream in)
        Creates a BufferedInputStream and saves its argument,
        Parameter:
          InputStream in, for later use an internal buffer array is 
          created and stored in buf
      public BufferedInputStream(InputSteam in, int size)
        Creates a BufferedInputStream with the specified buffer size and saves
        its argument,
        Parameter:
          InputStream in, the underlying input stream
          int size, the buffer size
    USAGE:
      1. Creates an object of FileInputStream for binding file in Constructor.
      2. Creates an object of BufferedInputStream for passing FileInputStream object.
      3. Calls method read() to read the file.
      4. Calls method close() to release the system source.
*/
public class Demo02BufferedInputStream {
  /** . */
  public static void main(String[] args) throws IOException {
    // 1
    FileInputStream fis = new FileInputStream("bu.txt");

    // 2
    BufferedInputStream bis = new BufferedInputStream(fis);
    // 3 calls method int read()
    // int length = 0;
    // while ((length = bis.read()) != -1) {
    // System.out.println(length);
    // }
    // result will be in byte form, 66 101 108 108 97

    // 3 calls method int read(byte[] b, int off, int len)
    byte[] bytes = new byte[1024];
    int length = 0;
    while ((length = bis.read(bytes)) != -1) {
      System.out.println(new String(bytes, 0, length));
    }
    // result will be the same as "Bella" in the file. 

    // 4 ONLY need to close bis, b/c bis will close fis as well
    bis.close();
  } // main
}
