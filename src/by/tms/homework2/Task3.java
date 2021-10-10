package by.tms.homework2;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 6, 7};
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < arr3.length; k += 2) {
            if (i < arr1.length) {
                if (j < arr2.length) {
                    arr3[k] = arr1[i];
                    arr3[k + 1] = arr2[j];
                    j++;
                    i++;
                } else {
                    arr3[k] = arr1[i];
                    arr3[k + 1] = arr1[i + 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
