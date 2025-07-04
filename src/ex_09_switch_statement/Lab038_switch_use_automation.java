package ex_09_switch_statement;

import java.util.Scanner;

public class Lab038_switch_use_automation {
    public static void main(String[] args) {

        //use of switch statement in automation
        //Example - Ask user to giv i/p from browser which h wants to use so we can start the
        //automation with that browser.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser, which you want to start");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome":
              System.out.println("Starting the browser");
              System.out.println("......");
              System.out.println("TC1");
              System.out.println("TC2");
              break;
            case "Firefox":
              System.out.println("Starting firefox browser ");
              break;
            case "Edge":
              System.out.println("Execute the edge code");
                break;
            default:
              System.out.println("I have no idea which browser is this");
            break;

        }
    }
}
