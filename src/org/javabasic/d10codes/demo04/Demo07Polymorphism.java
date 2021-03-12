package org.javabasic.d10codes.demo04;

/*
  1. Polymorphism:
      means "many forms", and it occurs when 
        we have many classes that are related to each other by inheritance.
      Premise: 
        extends and implements are the premise of Polymorphism.
      Format:
        Superclass objName = new Subclass();
      Key point:
        1. 父類名稱 對象名 = new 子類名稱()；
           或 
           接口名稱 對象名 = new 實現類名稱()；
           父類引用指向子類對象
        2. When Subclass override method of Superclass,
           object will call overrode method first.
        3. Subclass also can call methods in Superclass
            b/c Subclass inherited from Superclass.
  
    Why And When To Use "Inheritance" and "Polymorphism"?
      - It is useful for code reusability: 
        reuse attributes and methods of an existing class 
        when you create a new class.
*/
public class Demo07Polymorphism {
  /** Demo of Polymorphism. */
  public static void main(String[] args) {
    // using polymorphism to declare an object.
    Superclass spc = new Subclass();
    spc.method(); // call overrode method in Subclass
    spc.superMethod(); // method in Superclass, inherited
  } // main
}
