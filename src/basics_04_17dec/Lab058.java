package src.basics_04_17dec;

import java.util.Scanner;

public class Lab058 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Char, I will tell if it is vowel"); // aeiou

        char user_input = sc.next().toCharArray()[0];
        System.out.println(user_input);
        // both above lines are to convert char , sc.next().toCharArray()[0]
        // the to print System.out.println(user_input)

        switch (user_input){
            case 'a':
            System.out.println("VOWEL");
            break;

            case 'e':
                System.out.println("VOWEL");
                break;

            case 'i':
                System.out.println("VOWEL");
                break;

            case 'o':
                System.out.println("VOWEL");
                break;

            case 'u':
                System.out.println("VOWEL");
                break;

            default:
                System.out.println("Not a Vowel, It is a Consonant");
        }




    }
}
