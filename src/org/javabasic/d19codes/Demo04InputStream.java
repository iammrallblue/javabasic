package org.javabasic.d19codes;

import java.io.FileInputStream;
import java.io.IOException;

/*
  java.io.InputStream: (a Superclass)
    public abstract class InputStream:
      This abstract class is the superclass of all classes representing
      an input stream of bytes.
    
    methods of Class InputSteam:

    Direct Known Subclasses of Class InputSteam:
      AudioInputStream, ByteArrayInputStream, FileInputStream, FilterInputStream, 
      InputStream, ObjectInputStream, PipedInputStream, SequenceInputStream, 
      StringBufferInputStream
      
      Class FileInputStream:
        Constructors:
          public FileInputStream(String name) throws FileNotFoundException
            - String name is the file path.
          public FileInputStream(File file) throws FileNotFoundException
            - File file is the file which will be operated.
          public FileInputStream(FileDescriptor fdObj)

          ** create object of Class FileInputSteam
          ** object opts files based on the parameters in constructor 

    Principle of read data from disk/ssd to memory:
      java program (code) -> JVM -> OS(operating system) -> OS reading data -> reading files
*/

public class Demo04InputStream {
  /** . */
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("tmp.txt");
    // int getChar = fis.read();
    // System.out.println(getChar); // 97

    // getChar = fis.read();
    // System.out.println(getChar); // 98

    // getChar = fis.read();
    // System.out.println(getChar); // 97

    // getChar = fis.read();
    // System.out.println(getChar); // -1 (no data)

    // getChar = fis.read();
    // System.out.println(getChar); // -1 (no data)

    // above codes are repeated. can use the loop optimization.
    // since we don't know what content in file, (dont know how many char)
    // using while loop
    int length = 0; // get char from file.
    while ((length = fis.read()) != -1) { // while fis.read() is not equal -1.
      // System.out.print(length + " "); // 104 101 108 108 111 44 32 98 101 108 108
      // 97 46
      System.out.print((char) length); // hello, bella.
    }

    fis.close();

  } // main
}
