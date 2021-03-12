package org.javabasic.d14codes;

import java.util.HashSet;

/*
  Class HashSet<E>:
    Implementation Class of the Set<E> interface, 
    backed by a hash table (actually a HashMap instance). 
    It makes no guarantees as to the iteration order of the set; 
    in particular, it does not guarantee that the order will remain 
    constant over time. This class permits the null element.
  Storage of Self-Defined data type:
    such as Student, String, Person,etc...
    ** needs to override the hashCode() and equals();

  Requirement:
    Same name and Same age will be considered as one person.
*/
public class Demo05HashSet {
  /** . */
  public static void main(String[] args) {
    // create object of HashSet<E>, data type is Student
    HashSet<Student> hashSet = new HashSet<>();

    Student student1 = new Student("Abby", 16);
    Student student2 = new Student("Bella", 17);
    Student student3 = new Student("Cath", 18);
    Student student4 = new Student("Abby", 16);

    // add objects of Class Student to hashSet
    hashSet.add(student1);
    hashSet.add(student2);
    hashSet.add(student3);
    hashSet.add(student4);
    System.out.print(hashSet);
    System.out.println();
    // [Person{name: Bella , age: 17}, Person{name: Abby , age: 16}, Person{name:
    // Abby , age: 16}, Person{name: Cath , age: 18}]
    // based on the result if method hashcode and equals are not override.
    // the duplicate element will be stored as well.  // print out hashCode of student1 and student4

    // after override hashCode() and equals() in Class Student
    // overrode hashCode() and equals() to prevent duplicate elements.
    System.out.println(student1.hashCode()); // 63047289
    System.out.println(student4.hashCode()); // 63047289

    System.out.println(student1 == student4); // false
    System.out.println(student1.equals(student4)); // true 

    System.out.println(hashSet); 
    //[Person{name: Bella , age: 17}, Person{name: Abby , age: 16}, Person{name: Cath , age: 18}]
    // result ONLY shows unique element.
  }
}
