package src.basics_03_16Dec_2023;

public class Lab028 {
    public static void main(String[] args) {

        int course = 100;
        float GST = 0.1845f;
        float total = course + GST*course; // use bigger bucket to avoid data loss
        System.out.println(total);

    }
}
