package org.javabasic.d14codes;

/*
  HashCode is an (decimal) integer which represents internal address of object.
HashCode differs from one object to another object.
HashCode acts like an identity for an object.

Purpose of HashCode:
  is used to store, remove, search in Set<E> and Map<E> Collections 
  (ex: HashSet<E>, HashMap<E>)
How to retrieve HashCode:
  the Class Object contains a method:
    public int hashCode() {} 

Review method toString()
  public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
  }
  System.out.println(personHashCode); // 1829164700
    6d06d69c is Hexadecimal form of 1829164700
  System.out.println(personHashCode2); // 2018699554
    7852e922 is Hexadecimal form of 2018699554

Review HashCode of Class String:
  method hashCode() is overridden in Class String:
      public int hashCode() {
        int h = hash;
        if (h == 0 && value.length > 0) {
            char val[] = value;

            for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
            }
            hash = h;
        }
        return h;
      } (See example)
*/
public class Demo04HashCode {
  /** Retrieving HashCode of an object. */
  public static void main(String[] args) {
    // create Object of Class Person, Person extends Object
    Person person = new Person();

    // // calling hashCode method which extended from Class Object
    // int personHashCode = person.hashCode();
    // System.out.println(personHashCode); // 1829164700

    // Person person2 = new Person();
    // int personHashCode2 = person2.hashCode();
    // System.out.println(personHashCode2); // 2018699554

    // // review method toString
    // System.out.println(person); // Person@6d06d69c
    // System.out.println(person2); // Person@7852e922

    // ** overrode the method hashCode in Class Person
    int personHashCode = person.hashCode();
    System.out.println(personHashCode); // 1

    Person person2 = new Person();
    int personHashCode2 = person2.hashCode();
    System.out.println(personHashCode2); // 1

    // review method toString
    System.out.println(person); // Person@1
    System.out.println(person2); // Person@1
    // HashCode is changed, since method hashCode() is overridden in Class Person.

    // review hashcode of Class String
    String str = new String("Bella");
    String str2 = new String("Abby");
    System.out.println(str.hashCode());
    System.out.println(str2.hashCode());
  } // main
}