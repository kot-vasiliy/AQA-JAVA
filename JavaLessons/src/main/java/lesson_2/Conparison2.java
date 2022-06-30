package lesson_2;

public class Conparison2 {
    public static void main(String[] args) {
        System.out.println(checkingNumber(-5));
    }

    public static String checkingNumber(int a) {
        String b;
        if (a >= 0) {
            b = "Positive";
        } else {
            b = "Negative";
        }
        return b;
    }
}
