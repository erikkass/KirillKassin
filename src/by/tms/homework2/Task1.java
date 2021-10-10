package by.tms.homework2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 1};
        for (int i = array.length - 1; i > 0; i--) {
            int temp;
            temp = array[i];
            array[i] = array[i - 1];
            array[i - 1] = temp;
        }
        System.out.print(Arrays.toString(array));
    }
}
