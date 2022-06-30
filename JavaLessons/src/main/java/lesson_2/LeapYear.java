package lesson_2;

public class LeapYear {
    public static void main(String[] args) {
        checkLeapYear(1900);
    }

    public static void checkLeapYear(int a) {
        if (a % 400 == 0) {
            System.out.println(a + " is a leap year");
        }else if (a%4==0 && a % 100 != 0) {
            System.out.println(a + " is a leap year");
        }else {
            System.out.println(a + " is not a leap year");
        }

    }
}
