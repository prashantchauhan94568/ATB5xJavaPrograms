package src.basics_03_16Dec_2023;

public class Lab033 {
    public static void main(String[] args) {

        String name = "The Testing Academy"; //SCP
        String name1 = "The Testing Academy"; //SCP
        // Only one String is there above,
        // name and name1 use the same string "The Testing Academy"
        // as "The Testing Academy" is already created
        // This is how memory management is done.

        String name2 = new String("The Testing Academy");
        // OA or sometime said Heap Area

        System.out.println(name == name1); // Reference is same here "The Testing Academy"

        System.out.println(name.equals(name1)); // equals - content is same here

        System.out.println(name == name2); // name amd name2 are in different areas

        System.out.println(name.equals(name2)); // content is same here

        System.out.println(name.equalsIgnoreCase(name2)); //
    }
}
