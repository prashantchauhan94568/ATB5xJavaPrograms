package src.basics_04_17dec;

import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {
        // If , else // Yes, No

        if(true)
        {
            System.out.println("This is true");
        }else
        {
            System.out.println("false");
        }

        if(true){
            System.out.println("Only if");
        }

        // if, else if, else
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 20) {
            System.out.println("Number is > 20");
        } else if (number > 10)
        {
            System.out.println("Number is > 10");
        } else {
            System.out.println("Number is < 20");
        }










    }
}
