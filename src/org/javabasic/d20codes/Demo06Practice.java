package org.javabasic.d20codes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;

/*
  Example:
    to resort content by numbers.
  STEPS:
    1. declares object of Hashtable for storing numbers.
    2. declares object of BufferedWriter,
    3. declares object of BufferedReader,


*/
public class Demo06Practice {
  public static void main(String[] args) throws IOException {
    // 1.
    Hashtable<String,String> map = new Hashtable<>();
    // 2. 
    BufferedReader br = new BufferedReader(new FileReader("temp2.txt"));
    // 3. 
    BufferedWriter bw = new BufferedWriter(new FileWriter("poem_out.txt"));
    // 4. calls method readLine() to read content row by row by while statment
    String line;
    while ((line = br.readLine()) != null) {
      // to split up number and content.
      String[] splitLine = line.split("\\.");
      // to store splited content to hashtable.
      map.put(splitLine[0], splitLine[1]);
    }
    // 7. iterating hashtable
    for (String key: map.keySet()) {
      String value = map.get(key);
      // 8. 
      line = key + "." + value;
      // 9.
      bw.write(line);
      bw.newLine();
    }

    // 10 
    br.close();
    bw.close();
  } // main
}
