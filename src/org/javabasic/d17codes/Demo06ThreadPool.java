package org.javabasic.d17codes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
  Thread Pool, similar with Containers:
    after JDK1.5, added new feature the Thread pool.
  Containers:
    Collection, ArrayList, HashSet, LinkedList, HashMap.
  For instance:
    using LinkedList<Thread>
  
  Advantage of ThreadPool:
    1. Thread pools provide a significant advantage by, simply put, 
    separating the execution of tasks from the creation and management of threads. 
    Additionally, when used right, they can greatly improve the performance of your application.
    And, the great thing about the Java ecosystem is that you have access to 
    some of the most mature and battle-tested implementations of thread-pools 
    out there if you learn to leverage them properly and take full advantage of them.
  Usage:
    java.util.concurrent.Executors
      Class Executors:
        Factory and utility methods for Executor, ExecutorService, ScheduledExecutorService, 
        ThreadFactory, and Callable classes defined in this package. 
        This class supports the following kinds of methods:
        methods of Class Executors:
          public static ExecutorService newFixedThreadPool(int nThreads)
            Creates a thread pool that reuses a fixed number of threads
            operating off a shared unbounded queue, using the provided
            ThreadFactory to create new threads when needed.
          return the newly created thread pool
          return object of implementation class of interface ExecutorService
          we have to define ExecutorService type to receive the object.
        
        public interface ExecutorService extends Executor
          methods:
               <T> Future<T> submit(Callable<T> task);
              Submits a value-returning task for execution and returns a
              Future representing the pending results of the task.
              void shutdown();
                Initiates an orderly shutdown in which previously submitted
                tasks are executed, but no new tasks will be accepted.
    Usage of Thread pool:
      1. using static method newFixedThreadPool from Class Executors ot estimate
          specified number of threads.
      2. declaring a implementation class to implement interface Runnable, override method run(), 
          set up thread tasks.
      3. calling method submit() from interface ExecutorService to pass thread tasks (implementation class)
          enable thread, then execute run()
      4. calling method showdown() to destroy the thread pool,(NOT recommended)
*/
public class Demo06ThreadPool {
  public static void main(String[] args) {
    // 1. 
    ExecutorService es = Executors.newFixedThreadPool(2);
    // 3. 
    es.submit(new RunnableImpl3());

    es.shutdown(); // NOT Recommended, it shutdown the whole thread pool.

    es.submit(new RunnableImpl3()); //ERROR, after shutdown, cannot get new thread.
    //RejectedExecutionException: Task java.util.concurrent.FutureTask@5c647e05

    
  } // main
}
