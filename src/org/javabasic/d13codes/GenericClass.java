package org.javabasic.d13codes;

/*
  Generic Class:
    Format:
      public class className<GenericType> {
        // Generic method
        public boolean add(GenericType) {
        }
        public GenericType get(int i) {
        }
      }
  How to declare a Generic Type, an ArrayList<E> Generic ArrayList
  A Generic is unknown type data, when the type is unknown, can use Generic to declare it.
  A Generic can accept any type of data. such as, Integer, String, Student, Employee, etc....
  A Generic type MUST be determined when the object of Collection or ArrayList is created.
*/
public class GenericClass<E> {
  // when data type is unknown, we set GenericClass<E>
  // and instance variable and method E as well
  private E name;
  private E age;

  // Setter, Getter
  public void setName(E name) {
    this.name = name;
  }

  public E getName() {
    return name;
  }

  public void setAge(E age) {
    this.age = age;
  }

  public E getAge() {
    return age;
  }
}
