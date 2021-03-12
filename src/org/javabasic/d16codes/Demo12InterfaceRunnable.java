package org.javabasic.d16codes;

import java.lang.Thread;

/*
  Interface Runnable:
    The Runnable interface should be implemented by any class
    whose instances are intended to be executed by a thread.
      interface Runnable is second method to create a new thread.
    
    The constructor of Class Thread can pass the object of implementation class of 
    Interface Runnable.
      Thread(Runnable target)
        Allocates a new Thread object.
      Thread(Runnable target, String name)
        Allocates a new Thread object.   
    Steps:
      1. create implementation class of interface Runnable.
      2. in implementation class to override method run() from interface Runnable
      3. create object of implementation class of interface Runnable
      4. create object of Class Thread, and pass in the object of implementation class as parameter
      5. call Class Thread's method start() to enable a new thread, then execute method run()
    PROS and CONS of interface Runnable:
      1. void limitation of the single inheritance. which one class ONLY inherits from one class.
          for instance, A Subclass of Class Thread cannot inherits from other class,
          implementation class implements interface Runnable,or more interface
          also can inherits from other class.
      2. enhance code's extensibility, lower the coupling.
*/
public class Demo12InterfaceRunnable {
  /** . */
  public static void main(String[] args) {
    // object of implementation class (InterfaceRunnableImpl.java)
    InterfaceRunnableImpl implRunnable = new InterfaceRunnableImpl();

    // create object of Class Thread
    Thread thread = new Thread(implRunnable);
    // enable a new thread
    thread.start();

    System.out.println("main thread name is: " + Thread.currentThread().getName()); // main
  } // main
}
