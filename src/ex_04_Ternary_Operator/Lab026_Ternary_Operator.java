package ex_04_Ternary_Operator;

public class Lab026_Ternary_Operator {
    public static void main(String[] args) {
        //Conditional or Ternery Operator - very similar to If-else statement.
        //syntax - Result = condition? expression1 : expression2
        //condition - This is a boolean expression that is evaluated.
        //expression1 - This expression is executed if condition is true.
        //expression2 - This expression is executed if condition is false.

        //Example 1 -- voting age
        int age = 10;
        String canIvote = age > 18 ? "Yes" : "No";
        System.out.println(canIvote);

        //Example 2 -- number is positive or negative
        int a = 5;
        String no_is = a > 0 ? "positive" : "negative";
        System.out.println(no_is);

        //Example 3 -- min number between two numbers and with ASCII Value.
        int b = 'A';   // ASCII value 65
        int c = 'B';   // ASCII value 66
        int max = b > c ? b :c;
        System.out.println(max);

        //Example 4 -- Find number is even or odd
        int d = 88;
        String result = (d%2 == 0) ? "Even" : "Odd";
        System.out.println(result);


    }
}
