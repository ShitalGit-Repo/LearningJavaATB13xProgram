package ex_04_Ternary_Operator;

public class Lab027_Nested_Ternary {
    public static void main(String[] args) {
        //syntax - Result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        //Used when you have multiple conditions.

        //Example 1 --
        //age = 23;
        //age < 18 = Minor
        //18 < age > 65 = Adult
        //age > 65 = Senior citizen

        int age = 23;
        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior citizen";
        System.out.println(result);

        //Example 2 -- Find max between three numbers.
        int a = 'A';
        int b = 'C';
        int c = 'B';
        String max = (a > b) ? "a is greater" : (b > c) ? "b is greater" : "c is greater";
        System.out.println(max);

    }
}
