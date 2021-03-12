package org.javabasic.d20codes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* 
  java.io.ObjectOutputStream;
    public class ObjectOutputStream extends OutputStream
    implements ObjectOutput, ObjectStreamConstants
    Constructor:
      public ObjectOutputStream(OutputStream out):
        Creates an objectOutputStream that writes to the specified
        OutputSteam.
    Methods:
      public void writeObject(Object obj):
        Write the specified object to the ObjectOutputStream. The class of the object,

    USAGE:
      1. creates an object of ObjectOutputStream, passing byte output stream in Constructor
      2. calls method writeObject() to write specified object to file
      3. calls method close()

    public class NotSerializableException: (from Serializable Interface)
      thrown when an instance is required to have a Serializable interface.
      to state classes serialized or deserialized, the class MUST implement Interface Serializable.
      if class did not implement interface Serializable. it will be occurred 
      NotSerializableException when it required serialization.
        (see Person.java)
*/
public class Demo10ObjectOutputStream {
  /**
   * .
   */
  public static void main(String[] args) throws IOException {
    // 1.
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));

    // 2. calls method writeObject()
    oos.writeObject(new Person("Bella", 15));
    // throw error, java.io.NotSerializableException

    // 3.
    oos.close();
  } // main
}
