package src.basics_03_16Dec_2023;

public class Lab029 {
    public static void main(String[] args) {

        String s1 = "Prashant";
        // String constant pool - SCP/String pool

        // New operator - Object
        String s2 = new String("Prashant"); // Original is intellij feature
        // New operator is used to create a new object for class.
        // It returns of the address of  newly created object.

        System.out.println(s2);
        System.out.println(new String("Prashant"));


    }
}
