package org.javabasic.d16codes;

// 1. create Class Thread's Subclass
public class NewThread extends Thread {

  public NewThread() {

  }

  public NewThread(String name) {
    super(name);
  }

  // 2. to override method run() from Class Thread in Subclass
  @Override
  public void run() {
    // for (int i = 0; i < 20; i++) {
    // System.out.println("overrode method run()" + i);
    // }

    // // method 1: get thread name
    // String threadName = getName();
    // System.out.println(threadName); // Thread-0

    // // method 2: get thread name by method currentThread()
    // Thread newThread = Thread.currentThread();
    // System.out.println("New Thread: " + newThread);
    // // New Thread: Thread[Thread-0,5,main]
    // // New Thread: Thread[Thread-1,5,main]

    // method3: get thread name (method chaining)
    System.out.println(Thread.currentThread().getName());
    // Thread-0
    // Thread-1
  }
}
