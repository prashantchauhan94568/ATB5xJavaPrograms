package src.basics_03_16Dec_2023;

public class Lab023 {
    public static void main(String[] args) {
        // Logical Operators
        // || -> OR operator

        // T || T -> T
        // T || F -> T
        // F || T -> T
        // F || F -> F

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // && -> and operator
        // T && T -> T
        // T && F -> F
        // F && T -> F
        // F && F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);


    }
}
