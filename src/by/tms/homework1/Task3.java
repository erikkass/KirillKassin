package by.tms.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;
        System.out.print("Введите количество дней: ");
        days = scanner.nextInt();
        int rains;
        int sum = 0;
        int sr;
        int i = 1;
        for (; i <= days; i++) {
            System.out.print("Количество осадков за" + " " + i + " " + "день:" + " ");
            rains = scanner.nextInt();
            sum += rains;
            System.out.println("День:" + " " + i + " " + "Количество осадков:" + " " + rains);
        }
        System.out.println("Сумма осадков за период: " + sum);
        sr = sum / days;
        System.out.println("Среднее количество осадков за" + " " + days + " " + "дней:" + " " + sr);
    }
}
