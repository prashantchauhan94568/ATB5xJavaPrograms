package src.basics_04_17dec;

import javax.swing.*;
import java.util.Scanner;

public class Lab055 {
    public static void main(String[] args) {

        // Triangle Classifier:
        // Write a program that classifies a triangle based on its side lengths
        // Give three input values representing the lengths of the sides, determine
        // if the triangle is equilateral (all sides are equal),
        // isosceles ( exactly two sides are equal ), or
        // scalene ( no sides are equal).
        // Use an if-else statement to classify the triangle

        // Let's do it -> user input side1, side2,side3
        // -> if side1=side2=side3 -> Equilateral
        // if side1=side2 or side2=side3 -> isosceles
        // else scalene

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1,side2,side3, I'll tell you the triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if((side1 == side2) && (side2 == side3) && (side1 == side3)){
            System.out.println("Triangle is Equilateral");

        } else if((side1 == side2) || (side1 == side3) || (side2 == side3)){
            System.out.println("Triangle is Isosceles");

        } else{
            System.out.println("Triangle is scalene");
        }




    }
}
