package org.javabasic.d17codes;

/*
  Create a new Thread in Anonymous Inner Class:
  
  Anonymous class has no name;
  Inner Class is estimated inside of a Class (outer class)

  Anonymous Inner Class is for simplifying our codes.
    simplifying the step of Subclass inherits from Superclass, override methods from Superclass
    and create object of Subclass.
    simplifying the step of implementation class implements from interface, override methods from
    interface, and create object of implementation class.

  Format:
    new Superclass/interface() {
      @override
      method()
    };
*/
public class Demo01NewThreadInInnerClass {
  /** . */
  public static void main(String[] args) {
    // the Superclass of thread is Class Thread.
    new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          System.out.println(Thread.currentThread().getName() + "bella"); // Thread-0bella
        }
      }
    }.start();

    // new thread by interface Runnable();
    // Polymorphism, Runnable runnable = new RunnableImpl();
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 9; i++) {
          System.out.println(Thread.currentThread().getName() + "abby"); // Thread-1abby
        }
      }
    };
    new Thread(runnable).start();
  } // main
}
