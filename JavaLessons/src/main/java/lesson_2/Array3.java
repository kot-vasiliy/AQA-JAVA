package lesson_2;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(a));
        multiplyTheArray(a);
        System.out.println(Arrays.toString(a));
    }

    public static void multiplyTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }
}
