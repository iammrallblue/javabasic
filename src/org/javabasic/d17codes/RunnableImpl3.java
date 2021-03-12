package org.javabasic.d17codes;

// 2.
public class RunnableImpl3 implements Runnable {

  @Override
  public void run() {
    // get name of thread
    System.out.println(Thread.currentThread().getName() + " New Thread is Created.");
    //pool-1-thread-1 New Thread is Created.
  }
  
}
