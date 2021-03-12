package org.javabasic.d03codes.demo03;

/*
  Switch Statement:
    to select one of many code blocks to be executed.
    format:
      switch (expression) {
        case x:
        // code block
        break;
        case y:
        // code block
        break;
        case z:
        // code block
        break;
        default:
        // code block
        break;
      }
  Instance:
    using switch statement to print out day of the week
    last "default" can be ignored. but recommend to keep it.

  NOTICE:
    1. the values behind case keyword CANNOT be duplicated. case can be unordered.
      ERROR, Duplicate case.
    2. the primitive values can ONLY be in the brackets behind switch keyword 
        are byte/short/chat/int and the reference values are Class String, 
        and Class enumeration.

    3. the format of switch statement can be flexible, default can be ignored, but
        can be duplicated. default will only execute when all cases are NOT matched. 
        recommend default MUST after all cases, b/c it shows the end of the switch statement. 
        last break can be ignored.
    4. the expression is evaluated once (using once)
    5. the value of expression is compared with the values of each case (behind case)
    6.
*/
public class Demo07SwitchStatement {
  /** example for switch statement. */
  public static void main(String[] args) {
    int dayOfWeek = 3; // 3 goes to compare with numbers behind cases.
    switch (dayOfWeek) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Errors! 5");
        break; //
    }
  } // main
}
