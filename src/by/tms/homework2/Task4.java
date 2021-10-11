package by.tms.homework2;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}};
        int[] linearize = linearize(array);
        System.out.println(Arrays.toString(linearize));
    }

    public static int[] linearize(int[][] array) {
        int k = 0;
        int i = 0;
        int[] array2 = new int[array.length*array[i].length];
        for (; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[k] = array[i][j];
                k++;
            }
        }
        return array2;
    }
}

