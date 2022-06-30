package lesson_2;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] a = {0,1,3};
        System.out.println(Arrays.toString(a));
        array01(a);
        System.out.println(Arrays.toString(a));
    }

    public static void array01(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                System.out.println("arr[" + i + "]" + "was not changed");
            }
        }
    }
}
