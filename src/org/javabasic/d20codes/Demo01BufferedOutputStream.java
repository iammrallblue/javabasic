package org.javabasic.d20codes;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
  java.io.BufferedOutputStream:
    Class BufferedOutputStream extends FilterOutputStream
      The class implements a buffered output stream. by setting up
      such an output stream,
    Methods of Abstract Class OutputStream:
      public void close() throws IOException:
      public void flush() throws IOException:
      public void write(byte b[]) throws IOException:
      public void write(byte b[], int off, int len) throws IOException:
      public abstract void write(int b) throws IOException;:
    Constructors of Class BufferedOutputStream:
      public BufferedOutputStream(OutputStream out):
        Creates a new buffered output stream to write data to the specified 
        underlying output stream with the specified buffer size.
        Parameter:
          OutputStream out, the underlying output stream
      public BufferedOutputStream(OutputStream out, int size):
        Creates a new buffered output stream to write data to the specified
        underlying output stream with the specified buffered size.
        Parameters:
          OutputStream out, the underlying output stream
          int size, the buffer size.
    USAGE:
      1. Declare an object of FileOutputStream for combing file path
      2. Declare an object of BufferedOutputStream for passing FileOutputStream's 
          object  
      3. Calling method write() from BufferedOutputStream to write data to buffer.
      4. Calling method flush() from BufferedOutputStream to write date form buffer 
          to file. (Can be avoided b/c step 5 will calling method flush() before close)
      5. Calling method close() to 

*/
public class Demo01BufferedOutputStream {
  /** . */
  public static void main(String[] args) throws IOException {
    // 1
    FileOutputStream fos = new FileOutputStream("bu.txt");

    // 2
    BufferedOutputStream bos = new BufferedOutputStream(fos);

    // 3
    String str = "Bella, you had me at-hello";
    // bos.write("Bella, ".getBytes());
    bos.write(str.getBytes());

    // 4
    bos.flush();

    // 5
    bos.close();
  } // main
}
