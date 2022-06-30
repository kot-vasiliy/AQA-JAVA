package lesson_2;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] a = new int[100];
        System.out.println(Arrays.toString(a));
        fillTheArray(a);
        System.out.println(Arrays.toString(a));
    }

    public static void fillTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }
}
