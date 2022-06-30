package lesson_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(arrayOffSet(a, 4)));
    }

    public static int[] arrayOffSet(int[] arr, int n) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(i, arr[i]);
        }

        for (int i = 0; i+n < arr.length; i++) {
            arr[i + n] = hashMap.get(i);
            a = i;
        }
        for (int j = 0; j < n; j++){
            arr[j] = hashMap.get(a+j+1);
        }

        return arr;
    }


}
