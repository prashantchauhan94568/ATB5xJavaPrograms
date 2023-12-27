package src.basics_03_16Dec_2023;

public class Lab041 {
    public static void main(String[] args) {

        // Increment Operator
        int a = 10;
        System.out.println( ++a + a++ + a++ );
        System.out.println(a);

        // Part - A (Expression=11. a=11) -> ++a -> Output -> 11
        // Part - B ((Expression=11. a=12) -> a++ -> Output -> 11
        // Part - C ((Expression=12. a=13) -> a++ -> Output -> 12
        // A+B+C -> 11+11+12 -> 34, a-> 13

    }
}
