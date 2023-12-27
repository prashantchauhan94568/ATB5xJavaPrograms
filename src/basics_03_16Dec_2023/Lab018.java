package src.basics_03_16Dec_2023;

public class Lab018 {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        System.out.println(a+b);
        String name = "Prashant";
        System.out.println(a+name); // integer plus string -> Concatenation happens
        System.out.println(name+a); // String plus integer -> Concatenation happens
        // Interview -> Left to Right

        // String + other concatenation
        System.out.println(a+b+name);

        // All the + below are Concatenate
        System.out.println(name+a+b);

    }
}
