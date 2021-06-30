package org.javabasic.d02codes.demo02;

/*
  Increment (++) and Decrement (--)
    Increment and Decrement are Unary Operators.
    We can only apply these operators on a single operand, 
    hence these operators are called as unary operators.  
    we can apply these unary operators on all primitive types except Boolean.
    
    Types of Increment and Decrement Operator :
      Pre Increment / Pre Decrement Operator
      Post Increment / Post Decrement Operator
        Difference:
          When ++/-- in the single operand, ++val, and val++ have no difference.
          When ++/-- in the multiple expression,
            A. if ++val, the val variable increments a value by 1 right way, then having the result
            B. if val++, having the result then increments a value by 1.
                see example
    Syntax :
      ++ Increment operator : increments a value by 1
      -- Decrement operator : decrements a value by 1
    Pre-Increment Operator :
      “++” is written before Variable name.
      Value is Incremented First and then incremented value is used in expression.
      “++” cannot be used over “Constant” of “final Variable“. 
        30++, ++20, ERRORS,
  NOTICE:
    ONLY variable can use increment and decrement, 
    Constant can't be changed, therefore, it can not use increment, and decrement.
*/
public class Demo06IncrementDecrement {
    /** Demo of Increment and Decrement. */
    public static void main(String[] args) {
        int val = 10;
        System.out.println(val); // 10
        ++val; // preincrement
        System.out.println(val); // 11
        val++; // postincrement
        System.out.println(val); // 12

        // increment and decrement using with another expressions
        int val2 = 20;
        System.out.println(val2); // 20
        System.out.println(++val2); // 21
        System.out.println(val2); // 21

        int val3 = 30;
        System.out.println(val3); // 30
        System.out.println(val3++); // 30
        System.out.println(val3); // 31

        int val4 = 40;
        int result = --val4; // 39
        System.out.println(result); // 39

        int x = 10;
        int y = 20;
        int result1 = ++x + y--; // 11 + 20
        System.out.println(result1); // 31
        System.out.println(x); // 11
        System.out.println(y); // 19
    } // main
}