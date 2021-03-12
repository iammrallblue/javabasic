package org.javabasic.d16codes;

import java.lang.Thread;

/*
  Class Thread:
    methods of Class Thread:
      @Override
      public void run()
        If this thread was constructed using a separate Runnable run object, 
        then that Runnable object's run method is called; 
        otherwise, this method does nothing and returns.
      public final String getName()
        Returns this thread's name.
      public static native Thread currentThread()
        A hint to the scheduler that the current thread is willing to yield
        also, can get thread's name by this method.
        (See New Thread.java)
      public final synchronized void setName(String name)
        Changes the name of this thread to be equal to the argument name.
      public static void sleep(long millis, int nanos)
        Causes the currently executing thread to sleep (temporarily cease
        execution) for the specified number of milliseconds plus the specified number of nanoseconds

  Thread name:
    main thread: main
    new thread: Thread-0

    How to set a name to a new thread:
      1. by using method setName() in Class Thread.
      2. by declaring a parameterized constructor in Subclass (NewThread.java)
          thread name as the parameter passed to Superclass (Class Thread)
          let Class Thread to give a name to new thread.
          (See set a name by Class Thread)
  

*/
public class Demo11MethodsInThread {
  /** . */
  public static void main(String[] args) {
    // // object of Subclass NewThread
    // NewThread newThread = new NewThread();

    // // calling method run() by using method start()
    // newThread.start(); // Thread-0

    // // new thread
    // new NewThread().start(); // Enable multiple-threads

    // // new thread
    // System.out.println(Thread.currentThread().getName());

    // // method 1: set a name by Class Thread
    // NewThread newThread2 = new NewThread();
    // newThread2.setName("bella");
    // newThread2.start(); // new thread name is "bella"

    // // method2 : set a name by Class Thread (See constructor in Class NewThread)
    // new NewThread("abby").start(); // new thread abby

    // method sleep()
    for (int i = 0; i <= 60; i++) {
      System.out.println(i);

      // by using method sleep() to make a thread sleep for specified
      // number of millisecond.
      try {
        Thread.sleep(600);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  } // main
}
