package lesson_2;

import java.util.Scanner;

public class Comparison3 {
    public static void main(String[] args) {
        System.out.println("Enter any int number: ");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        System.out.println(checkingNumber(b));
    }

    public static boolean checkingNumber(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }
}
