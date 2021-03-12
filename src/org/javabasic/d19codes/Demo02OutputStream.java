package org.javabasic.d19codes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
  java.io.OutputStream: 
    Abstract Class OutputStream:
      This abstract class is the superclass of all classes representing
      an output stream of bytes. An output stream accepts output bytes
      and sends them to some sink.    
  methods of abstract class OutputStream: 
    public void write(byte b[]) throws IOException:
    public void write(byte b[], int off, int len) throws IOException:
    ** writing data as many as you want to.
*/
public class Demo02OutputStream {
  /**
   * .
   * 
   */
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream(new File("temp.txt"));

    fos.write(49);
    fos.write(48);
    fos.write(48);

    // fos.close();

    // better method to write more data in one time.
    // public void write(byte b[])
    byte[] bytes = { 65, 66, 67, 68, 69 }; // 100ABCDE
    // byte[] bytes = { -65, -66, -67, 68, 69 }; //100***E (*** Chinese)
    fos.write(bytes);

    // public void write(byte b[], int off, int len) throws IOException:
    // to write specific length of byte[] to file by byte[] index
    fos.write(bytes, 1, 2); // 100ABCDEBC

    // method to write byte[] data, getBytes() from Class String
    // public byte[] getBytes()
    byte[] bytes2 = "Hello,Bella".getBytes();
    System.out.println(Arrays.toString(bytes2)); 
    // [72, 101, 108, 108, 111, 44, 66, 101, 108, 108, 97]
    fos.write(bytes2);

    fos.close();

  } // main
}
