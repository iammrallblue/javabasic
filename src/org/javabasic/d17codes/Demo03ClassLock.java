package org.javabasic.d17codes;


/*
  Solution 3 for thread safety:
  java.util.concurrent.locks
    interface Lock:
      Lock implementations provide more extensive locking operations 
      than can be obtained using synchronized methods and statements. 
    methods of interface Lock:
      void lock();
        Acquires the lock.
      void unlock();
        Releases the lock.
    Implementation Class:
      ReentrantLock implements Lock
    Steps:
      1. Create object of ReentrantLock,
      2. call method lock() from interface Lock before the code with thread safety issue
      3. call method unlock() interface Lock after the code with thread safety issue.
      (See RunnableImpl2.java)

*/
public class Demo03ClassLock {
  
}
