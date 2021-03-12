package org.javabasic.d13codes;

/*
  Generic Interface:
    Format:
      public interface interfaceName<I> {
        // abstract method
        public abstract void method(I i);
      }
  Usage:
      1. declare an implementation class of Generic Interface.
          and determine the date type of Generic Interface 
          (see GenericInterfaceImpl.java)
          Overrode Methods:
            public interface Iterator<E> {
              E next();
            }
            // Class Scanner implemented the Generic Interface iterator<E>
            and determine the data type of Generic Interface - String.
            overrode the next method from Generic Interface, default data type is String
            public final class Scanner implements Iterator<String> {
              public String next() {
              }
            }
      2.  Generic Interface and Implementation Class have the same Generic type
          Implementation Class is followed Generic Interface.
          (see GenericInterfaceImpl2.java)
          Overrode Methods:
            public interface List<E> extends Collection<E> {
              boolean add(E e);
              E get(int index);
            }
            public class ArrayList<E> implements List<E> {
              public boolean add(E e) {
              }
              public E get(int index) {
              }
            }
*/
public interface GenericInterface<I> {
  public abstract void method(I i); 

}
