package org.javabasic.d20codes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
  java.io.ObjectInputStream:
    public class ObjectInputStream extends InputStream
    implements ObjectInput,ObjectStreamConstants:
      An ObjectInputStream deserializes primitive data and object previously written
      using an ObjectOutputStream.
      Constructor:
        public ObjectInputStream(InputStream in):
          Creates an ObjectInputStream that reads from the specified InputStream.
          ** A serialization stream header is read from the stream and verified.
      Method:
        public Object readObject()
          Read an object from the ObjectInputStream. return Object.
      USAGE:
        1. Creates an object of ObjectInputStream
        2. calls method readObject() to read from Class ObjectInputStream
        3. calls method close()
        4. print out result.

      ClassNotFoundException
*/
public class Demo11ObjectInputStream {
  /**
   * .
   */
  public static void main(String[] args) throws ClassNotFoundException, IOException {
    // 1.
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));

    // 2. 
    Object obj = ois.readObject();

    // 3. 
    ois.close();

    // 4. 
    System.out.println(obj);
  } // main
}
