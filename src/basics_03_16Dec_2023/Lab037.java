package src.basics_03_16Dec_2023;

public class Lab037 {
    public static void main(String[] args) {

        // Ternary operator - Means condition
        // int a = condition? if this is true, print this: else print this.

        // MAX in two numbers?
        int a = 10;
        int b = 20;
        int max = a < b ? b: a;
        int min = a < b ? a: b;
        System.out.println(max);
        System.out.println(min);

    }
}
