package lesson_2;

public class Conparison1 {
    public static void main(String[] args) {
        System.out.println(checkingSum(11, 20));
    }

    public static boolean checkingSum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
