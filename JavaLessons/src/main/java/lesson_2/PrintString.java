package lesson_2;

public class PrintString {
    public static void main(String[] args) {
        printSeveralString("Hello", 2);
    }

    public static void printSeveralString(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
}
