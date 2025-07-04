package ex_09_switch_statement;

import java.util.Scanner;

public class Lab037_switch_statement {
    public static void main(String[] args) {

        //switch statement - execute one statements from multiple condition.
        //must be of byte, long(with its wrapper type), short, int, enums and strings.
        //Example - take i/p from user and tell them a day

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7");
        int day = scanner.nextInt();

        switch (day) {                                                 //switch expression
            //{
            case 1:                                             //case statements
                System.out.println("Monday");
                break;                                             //values must be of same type of expression
            case 2:                                                //case value1 : expression = value1
                System.out.println("Tuesday");
                break;                                             //statements
            case 3:                                                //break; (break is optional)
                System.out.println("Wednesday");
                break;                                             //case value2 :
            case 4:                                                //statements
                System.out.println("Thursday");                    //break; (break is optional)
                break;
            case 5:                                                //default :
                System.out.println("Friday");                      //break;
                break;
            case 6:                                                //}
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not Allowed");
                break;
        }
    }
}
