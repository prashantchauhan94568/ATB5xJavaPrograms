package src.basics_03_16Dec_2023;

public class Lab021_1 {
    public static void main(String[] args) {
        byte b = 65;
        System.out.println('A' == b);
        System.out.println('A' ==65.0); // This is property of Java
        System.out.println('A' == 65.0f);

        System.out.println('A' == 65.2);
        System.out.println('A' ==65.0000);

        System.out.println(true == true);
        // System.out.println(true == 0); // incomparable types: boolean and int

        // System.out.println(true>=true);
        // first type:  boolean
        // second type: boolean
        // can't be compared
    }
}

