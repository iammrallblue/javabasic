package org.javabasic.d02codes.practice;

public class Demo01NestedTernary {
    /** Demo of Nested Ternary Operator. */
    public static void main(String[] args) {
        int x = 10;
        String result = x > 10 ? "number is greater than 10"
                : x > 5 ? "number is greater than 5" : "number is less than 5";
        System.out.println(result);

        String result2 = x > 20 ? "Number is greater than 20"
                : x > 5 ? "Number is greater than 5" : "Number is less than 5";
        System.out.println(result2);
    } // main
}
