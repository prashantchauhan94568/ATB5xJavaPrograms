package src.basics_04_17dec;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] args) {
        // Grade Calculator
        // Write a program that calculates and displays the letter grade
        //for a given numerical score(eg. A, B,C,D,or F) based on the following
        //grading scale
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        //1. Input from server.
        // Score(Data Type) -> Int -> Grade (Char ot String)
        // DDA -> Check with interviewer for data type int/float etc.

        //2. Basic Logic/brute force logic, write basic rough code
        // if score >= 90 && score <= 100 -> Print 'A'
        // else score >= 80 && score <= 89 -> Print 'B'

        //3. Write the real code.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score");
        int score = sc.nextInt();

        if(score >= 90 && score <= 100){
            System.out.println("Your score -> A");
        }else if(score >= 80 && score <= 89){
            System.out.println("Your score -> B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Your score -> C");
        }else if (score >= 60 && score <= 69) {
            System.out.println("Your score -> D");
        }else {
            System.out.println("Your score -> F");
        }

        //4. Debug the code.
        //5. Fix the code and final it.







    }
}
