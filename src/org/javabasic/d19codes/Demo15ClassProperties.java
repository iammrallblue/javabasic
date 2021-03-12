package org.javabasic.d19codes;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
  java.util.Properties:
    Class Properties: (It's a Collection) 
      public class Properties extends Hashtable<Key, Value> implement Map<K,V>
        The Properties class represents a persistent set of properties. 
        The Properties can be saved to a stream or loaded from a stream. 
        
      ** Properties is ONLY collection to combine with IO Stream.
        methods:
          public void store(OutputStream out, String comments)
            writes this properties list (key and value) in this table to disk,
            Stream out
          public void store(Writer writer, String comments) 
            writes this properties list (key and value) in this table to the output
            character stream in a format suitable for using the method load().
            Parameters:
              OutputStream out, to write data as a byte stream to disk,
              (Cannot cast many Asia Characters like Chinese)
              Writer writer, to write data as a String to disk.
              (Can cast Asia Characters like Chinese)
              String comments,  description of the property list.
          public void load(Reader reader)
            Reads a property list(key and element pairs) from the input character stream
            in a simple line-oriented format. (read from disk)
          public void load(InputStream inStream)
            Reads a property list (key and element pairs) from the input byte stream.
            the input stream is in a simple line-oriented format as specified in load(Reader)
          
            Parameters:
              Reader reader, 
                reading character streams, that a Subclass MUST implement are 
                read(char[], int, int) and close(). Cannot read Asia Characters. 
              InputStream inStream,
                representing an input stream of bytes. no Chinese
              NOTICE:
                1. connection symbol for key and value can be = , space, or others
                2. the data in files can use # for comments, OutputStream will void 
                    all data with #.
                3. key and value are default String type in file,
            
        Each key and its corresponding value in the property list is a string.
          key and value are both String. (String is default)
          Since key and value are default String:
            there are some specific methods for opting data
              public synchronized Object setProperty(String key, String value) {
                return put(key, value); 
              } ** key and value are String and calling method put() 
                from Hashtable for return values. 
              public String getProperty(String key, String defaultValue) {}
                find value by key, it is similar with method get() in collection Map<k,v> 
              public Set<String> stringPropertyNames(): 
                Returns a set of keys in this property list where
                the key and its corresponding value are strings,
                ** the key is String (Set<String>). 
                    it is similar with method keySet() in collection Map<k,v>
*/
public class Demo15ClassProperties {
  /** . */
  public static void main(String[] args) throws IOException {
    method();
    method2();
    method3();
  } // main

  // method, load()
  private static void method3() throws IOException {
    Properties prop = new Properties();
    prop.load(new FileReader("prop.txt"));
    // iterating prop
    Set<String> set = prop.stringPropertyNames();
    for (String key : set) {
      String value = prop.getProperty(key);
      System.out.println(key + "=" + value);
    }
  }

  // method, store()
  private static void method2() throws IOException {
    Properties prop = new Properties();
    // prop.setProperty("Abby", "20");
    // prop.setProperty("Bella", "21");
    // prop.setProperty("Cathy", "22");
    // prop.setProperty("Danielle", "23");
    prop.setProperty("周慧敏", "20");
    prop.setProperty("邱淑貞", "21");
    prop.setProperty("朱茵", "22");
    prop.setProperty("鍾楚紅", "23");

    // FileWriter fw = new FileWriter("prop.txt");
    // prop.store(fw, "save what");
    // fw.close();

    FileWriter fw = new FileWriter("prop.txt");
    prop.store(new FileOutputStream("prop2.txt"), "saved by OutputStream");
    fw.close();
    // Those Chinese Characters save to txt file as ASCII codes. (see txt file)
  }

  // calling method store() to save data to disk
  private static void method() {
    // creating object of Class Properties,
    Properties prop = new Properties();
    // calling setProperty to add keys and values
    prop.setProperty("Abby", "15");
    prop.setProperty("Bella", "17");
    prop.setProperty("Cathy", "18");
    prop.setProperty("Danielle", "16");
    // also can calling method put to add keys and values
    // prop.put(1, true); // but as we knew that keys and values are String
    // recommended using method setProperty(), b/c put(Object key, Object value)
    // which can adding any type data as keys and values.

    // acquiring keys from the Properties prop by method stringPropertyName()
    // and storting to a Set collection
    Set<String> set = prop.stringPropertyNames();

    // iterating keys in the Set collection by for-each statement
    for (String key : set) {
      String keyValue = prop.getProperty(key);
      System.out.println(key + "=" + keyValue);
    }
  }
}
