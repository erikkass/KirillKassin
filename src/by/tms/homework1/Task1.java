package by.tms.homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.print("Введите число:" + " ");
        num = scanner.nextInt();
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Сумма цифр числа =" + " " + sum);
    }
}