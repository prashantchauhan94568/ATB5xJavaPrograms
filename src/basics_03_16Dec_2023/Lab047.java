package src.basics_03_16Dec_2023;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {

      /* EXAMPLE 1
       int a = 34;
        if(a%2 == 1) {
            System.out.println("ODD Number");
        } else {
            System.out.println("Even Number");
        }
        */

        // EXAMPLE 2 - Take an input from user? Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I'll tell if the number is event or odd");
        int a = sc.nextInt();

        if(a%2 == 1){
            System.out.println("ODD Number");
        }else{
            System.out.println("EVEN Number");
        }

    }
}
