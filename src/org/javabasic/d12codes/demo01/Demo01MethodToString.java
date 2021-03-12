package org.javabasic.d12codes.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
  java.lang.Object:
    public class Object
      Class Object is the root of the class hierarchy. 
      Every class has Object as a superclass. All objects, 
      including arrays, implement the methods of this class.

      Since Class Person inherits from Class Object, 
      it can use many methods from Class Object. 
          1st, public String toString() { 
                  returns a string representation of the object. 
                }
    NOTICE:
      1. to print out the name of object, is same as to call toString()
      2. to determine weather toString is re-overridden in Classes, 
          directly print out the Object name,

*/
public class Demo01MethodToString {
  /** Demo of method toString(). */
  public static void main(String[] args) {
    // object of Class Person
    Person person = new Person("Bella", 18);
    String str = person.toString();

    // when the toString method doest not override. (default toString())
    // System.out.println(str); // org.javabasic.d12codes.Person@6d06d69c
    // System.out.println(person); // ditto.

    // when the toString method is overridden.
    System.out.println(str); // Person{ name: Bella, age: 18 }
    System.out.println(person); // ditto.

    Random random = new Random();
    System.out.println(random); // determine toString() is overridden or not.
    // java.util.Random@123a439b, toString() of Class Random is not Overridden

    Scanner scanner = new Scanner(System.in);
    System.out.println(scanner); // toString() of scanner is Overridden.

    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    System.out.println(list); // [1,2]
    // toString() is Overridden.
  } // main
}
