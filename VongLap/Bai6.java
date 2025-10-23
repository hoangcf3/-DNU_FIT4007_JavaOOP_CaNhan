package VongLap;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương S: ");
        int S = scanner.nextInt();

        int sum = 0;
        int N = 0;

        while (sum <= S) {
            N++;
            sum += N;
        }

        System.out.println("Số nguyên dương N nhỏ nhất sao cho tổng vượt quá " + S + " là: " + N);
    }
}
