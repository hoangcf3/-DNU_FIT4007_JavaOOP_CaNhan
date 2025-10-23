package VongLap;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên N (1-9): ");
        int N = scanner.nextInt();

        if (N < 1 || N > 9) {
            System.out.println("Giá trị không hợp lệ. Vui lòng nhập số từ 1 đến 9.");
            return;
        }

        System.out.println("Bảng cửu chương của " + N + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}