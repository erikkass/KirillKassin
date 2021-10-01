package by.tms.homework1;

public class Task2 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2 + " ");
        for (int num3 = 0; num3 <= 21; num3++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
    }
}
