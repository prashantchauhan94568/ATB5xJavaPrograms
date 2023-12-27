package src.basics_03_16Dec_2023;

public class Lab038 {
    public static void main(String[] args) {

        // Ternary operator - Means condition
        // int a = condition? if this is true, print this: else print this.

        // MAX in three numbers?
        int a = 40;
        int b = 20;
        int c = 32;

        // (a>c) ? a:c
        // ((b>c) ? b:c)

        // Ternary operator within Ternary operator example
        int max = (a>b) ? ((a>c) ? a:c) : ((b>c) ? b:c);
        System.out.println(max);




    }
}
