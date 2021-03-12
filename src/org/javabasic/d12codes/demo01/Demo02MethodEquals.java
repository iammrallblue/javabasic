package org.javabasic.d12codes.demo01;

/*
  java.lang.Object:
    public class Object:
      Class Person default inherited from Class Object, therefore it can use equals()
        public boolean equals(Object obj){
            return (this == obj); 
            // Indicates whether some other object is "equal to" this one.
        }
        Key point:
          1. Object obj as argument, it can transmit any Objects
          2. ==, is comparison operator, returns a boolean value
          3. Primitive Type, is comparing values.
          4. Reference Type, is comparing Object's address in memory.
          5. this, means Object person in this example.
          6. obj, means Object person2 in this example.
          7. equals() is to compare hashcode addresses of 
              both objects. (person and person2),
              method equals() needs to be overridden for 
              comparing values of objects.
*/

public class Demo02MethodEquals {
  /** Demo of method equals(). */
  public static void main(String[] args) {
    // objects of Class Person
    Person person = new Person("Bella", 18);
    Person person2 = new Person("Bella", 18);

    // memory address
    System.out.println("memory address: " + System.identityHashCode(person));
    System.out.println("toString: " + String.valueOf(person)); // toString has overridden.

    // show objects' hashcode address
    System.out.println(person.hashCode());
    System.out.println(person2.hashCode());

    boolean isSame = person.equals(person2);
    System.out.println(isSame); // false
  } // main
}
