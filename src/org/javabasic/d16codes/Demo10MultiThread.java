package org.javabasic.d16codes;

/*
  How to create multiple-threads program,
    1. create Subclass of Class Thread.
      java.lang.Thread:
    Steps:
      1. create Class Thread's Subclass
      2. to override method run() from Class Thread in Subclass 
          to set multiple-threads task which means to enable multiple-threads.
      3. create object of Thread's Subclass.
      4. calling method start() inherited from Class thread to execute the override method run()
          void start() to execute run()
      (see code NewThread.java)
*/
public class Demo10MultiThread {
  /** . */
  public static void main(String[] args) {
    // 3
    NewThread newThread = new NewThread();
    // 4
    newThread.start();

    // execution by main method
    for (int i = 0; i < 20; i++) {
      System.out.println("main method executed: " + i);
    } 
  }
}
