package src.basics_04_17dec;

import java.util.Locale;
import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name chrome, firefox, edge, opera");
        String browser = sc.next(); // we can use this as well sc.nextLine()

        switch (browser.toLowerCase()) { // browser.toLowercase() -> to avoid case sensitive issue
        case "chrome":
            System.out.println("Execute the Chrome Code");
                break;

        case "firefox":
            System.out.println("Execute the firefox Code");
                break;

            case "edge":
                System.out.println("Execute the edge Code");
                break;

            default:
                System.out.println("I have no idea which browser is it");


        }
    }
}
