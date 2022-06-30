package lesson_2;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnArray(2, 10)));
    }

    public static int[] returnArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
