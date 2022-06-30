package lesson_2;

public class Array4 {
    public static void main(String[] args) {
        int[][] a = new int[7][7];
        fillInTheDiagonals(a);
    }

    public static void fillInTheDiagonals(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == j) || i + j + 1 == arr.length) {
                    arr[i][j] = 1;

                }
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
