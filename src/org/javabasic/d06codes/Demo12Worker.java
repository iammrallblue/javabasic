package org.javabasic.d06codes;

public class Demo12Worker {
  public static void main(String[] args) {
    Worker worker = new Worker();
    worker.setName("Bella");
    worker.setAge(18);
    System.out.println("Name: " + worker.getName() + ", Age: " + worker.getAge());

    Worker worker2 = new Worker("Abby", 19);
    System.out.println("Name: " + worker2.getName() + ", Age: " + worker2.getAge());

    // changing age
    worker2.setAge(20);
    System.out.println("Name: " + worker2.getName() + ", Age: " + worker2.getAge());
  } // main
}
