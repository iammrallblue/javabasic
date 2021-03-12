package org.javabasic.d11codes.demo02;

/*
  Four Access Modifiers: (See MyClass)
    1. public:
        means that all code can access the class, field, constructor or method, 
        regardless of where the accessing code is located. 
        The accessing code can be in a different class and different package.
    2. protected:
        provides the same access as the default access modifier, 
        with the addition that subclasses can access protected methods and 
        member variables (fields) of the superclass. This is true even 
        if the subclass is not located in the same package as the superclass.
    3. [default]:
        is declared by not writing any access modifier at all.
        means that code inside the class itself as well as code inside classes in the same package 
        as this class, can access the class, field, constructor or 
        method which the default access modifier is assigned to. Therefore, 
        the default access modifier is also sometimes referred to as the package access modifier.
    4. private:
        only code inside the same class can access the variable, or call the method. 
        Code inside subclasses cannot access the variable or method, 
        nor can code from any external class.
  Location                      public            protected           [default]           private
  Same Class                     Yes                Yes                 Yes                 Yes
  Same Package                   Yes                Yes                 Yes                 No
  Diff Package Subclass          Yes                Yes                 No                  No
  Diff Package Non-Subclass      Yes                No                  No                  No
*/
public class Demo02AccessModifiers {
  
}
