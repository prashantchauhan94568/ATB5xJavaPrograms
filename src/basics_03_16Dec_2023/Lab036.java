package src.basics_03_16Dec_2023;

public class Lab036 {
    public static void main(String[] args) {

        // Ternary operator - Means condition
        // int a = condition? if this is true, print this: else print this.

        int a = true? 10:20;
        int a1 = (30>40)? 10:20;
        System.out.println(a);
        System.out.println(a1);

        String str = 10 > 20 ? "10" : "Twenty";
        System.out.println(str);

        String anil_status = true ? "Yes" : "No";
        System.out.println(anil_status);


    }
}
