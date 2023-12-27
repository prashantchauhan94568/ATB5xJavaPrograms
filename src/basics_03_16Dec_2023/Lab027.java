package src.basics_03_16Dec_2023;

public class Lab027 {
    public static void main(String[] args) {

        //Casting - Molding
        // Widening - smaller to bigger bucket
        byte b = 10;
        // int a = b; // Implicit Casting - by JVM
         int a = (int) b; // Explicit casting - by JVM

        // Narrowing - Bigger to smaller bucket so Explicit must
        int a1 = 300;
        // byte b1 = a1; // Invalid - implicit casting
        byte b1 = (byte)a1; // EXPLICIT CASTING
        System.out.println(b1);

        // check Jva Notes for explanation how 44






    }
}
