package by.tms.homework2;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 5};
        int[] array2 = {5, 6};
        int[] arr3 = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < arr3.length; k += 2) {
            if (array1.length > array2.length) {
                if (i < array1.length) {
                    if (j < array2.length) {
                        arr3[k] = array1[i];
                        arr3[k + 1] = array2[j];
                        j++;
                        i++;

                    } else {
                        arr3[k] = array1[i];
                        arr3[k + 1] = array1[i + 1];
                        i += 2;
                        k++;
                    }
                }
            } else {
                if (i < array2.length) {
                    if (j < array1.length) {
                        arr3[k] = array2[i];
                        arr3[k + 1] = array1[j];
                        j++;
                        i++;
                        k++;

                    } else {
                        arr3[k] = array2[i];
                        arr3[k + 1] = array2[i + 1];
                        i += 2;
                        k++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
