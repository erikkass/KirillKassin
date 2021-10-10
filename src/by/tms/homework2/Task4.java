package by.tms.homework2;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}};
        int[] linearize = linearize(array);
        System.out.println(Arrays.toString(linearize));
    }

    public static int[] linearize(int[][] array) {
        int[] arr2 = new int[4];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arr2[k] = array[i][j];
                k++;
            }
        }
        return arr2;
    }
}

