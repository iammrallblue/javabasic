package org.javabasic.d20codes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
  java.io.OutputStreamWriter:
    public class OutputStreamWriter extends Writer:
      is a bridge from character streams to byte streams, also called encoding
    Methods:
      Methods inherited from class java.io.Writer:
        public void write(int c): 
          Writes a single character.
        public void write(char cbuf[]):
          Writes an array of characters.
        public void write(char cbuf[], int off, int len):
          Writes a potion of an array of characters
        public void write(String str):
          Writes a string
        public void write(String str, int off, int len):
          Writes a portion of a string.
        public void flush():
          flushes the stream
        public void close():
          closes and releases system source.
    Constructors:
      public OutputStreamWriter(OutputStream out, String charsetName):
        Creates an OutputStreamWriter that uses the named charset.
      public OutputStreamWriter(OutputStream out):
        Creates an OutputStreamWriter that uses the default character encoding.
        Parameters:
          OutputStream out, a superclass of all classes representing an output stream of bytes.
            An output stream accepts output bytes and sends them to some sink.
          String charsetName, specify encode, can be utf-8, gbk,..
      public OutputStreamWriter(OutputStream out, Charset cs):
      public OutputStreamWriter(OutputStream out, CharsetEncoder enc):
    
*/
public class Demo07OutputStreamWriter {
  public static void main(String[] args) throws IOException {
    method();
    method2();
  } // main

  /**
   * writes character in GBK.
   */
  private static void method2() throws IOException {
    // 1.
    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "GBK");
    // 2.
    osw.write("你好, 贝拉"); // result is unreadable code in UTF-8

    // 3.
    osw.flush();

    // 4.
    osw.close();
  }

  /** writes character in UTF-8. */
  private static void method() throws IOException {
    // 1.
    // OutputStreamWriter osw = new OutputStreamWriter(new
    // FileOutputStream("utf8.txt"), "UTF-8");
    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf8.txt"));
    // 2.
    osw.write("Hello,Bella");

    // 3.
    osw.flush();

    // 4.
    osw.close();
  }

}