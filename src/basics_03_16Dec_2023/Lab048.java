package src.basics_03_16Dec_2023;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {

        // Take two input from user and give max out of two number
        // a,b a>b -> a, else b

        Scanner sc = new Scanner(System.in); // Learn the command , OOPs
        System.out.println("Enter the a,b");
        int a = sc.nextInt(); // Learn the command
        int b = sc.nextInt(); // Learn the command

        if(a>b){
            System.out.println("Max > " +a);
        }else{
            System.out.println("Max > " +b); // We can print directly a/b
            // we added + for concatenation, to add message as well
            // + for adding a value of string and integer
        }
    }
}
