package org.javabasic.d17codes;

public class RunnableImpl4 implements Runnable {

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " New Thread is Created.");
  }
  
}
