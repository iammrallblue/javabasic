package org.javabasic.d20codes;

public class Demo10Synchronized {
  /** synchronized example. */
  public static synchronized void main(String[] args) throws InterruptedException {
    Thread th = new Thread();
    th.start();
    System.out.println("A");
    th.wait();
    System.out.println("B");
  } // main
}
