package org.javabasic.d19codes;

import java.io.FileOutputStream;
import java.io.IOException;

/*
  java.io.OutputStream: 
    Abstract Class OutputStream:
      This abstract class is the superclass of all classes representing
      an output stream of bytes. An output stream accepts output bytes
      and sends them to some sink.
  
    methods of Abstract Class OutputStream:
      public void close() throws IOException:
      public void flush() throws IOException:
      public void write(byte b[]) throws IOException:
      public void write(byte b[], int off, int len) throws IOException:
      public abstract void write(int b) throws IOException;:

    java.io.FileOutputStream extends OutputStream:
      A file output stream is an output stream for writing data to a
      File or to a FileDescriptor. Whether or not a file is 
      available or may be created depends upon the underlying platform.  
      (data from memory to disk(ssd))

    Constructors of FileOutputStream:

      public FileOutputStream(String name):
        Creates a file output stream to write to the file with the
        specified name.
          argument String name:
            it is path where data write into.

      public FileOutputStream(File file):
        Creates a file output stream to write to the file represented by
        the specified <code>File</code> object
          argument File file:
            it is file which data write into.
      What is constructor for:
        1. instantiate an object of FileOutputStream.
        2. based on the argument(String name which is path) to create an empty file.
           based on the argument(File file which is file) to create an empty file.
        3. point the object of FileOutputStream to the created empty file.
    The principle of writing data (memory to disk):
      Java Program -> JVM ->(OS)Operating System -> 
      OS calling writing data method -> writing data to file.

*/
public class Demo01OutputStream {
  /**
   * .
   * 
   */
  public static void main(String[] args) throws IOException {
    // 1. object of FileOutputStream for creating a new text file
    FileOutputStream fos = new FileOutputStream("/Users/junoh/Workspace/javabasic/tmp.txt");

    // calling method write() to write data(bytes) to the new file.
    fos.write(56); // 8

    // calling method close() to release fos.
    fos.close();
  } // main
}
