package org.javabasic.d16codes;

public class InterfaceRunnableImpl implements Runnable {

  @Override
  public void run() {
    System.out.println("Current Thread Name: " + Thread.currentThread().getName());
    for (int i = 0; i < 3; i++) {
      System.out.println("method run() overrode in implementation class."); // Thread-0
    }
  }
  
}
