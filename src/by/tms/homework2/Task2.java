package by.tms.homework2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++)
                if (array[i] == array[j]) {
                    array[i] = 0;
                }
        }
        System.out.println(Arrays.toString(array));
    }
}
