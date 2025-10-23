package VongLap;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tự nhiên N: ");
        int N = scanner.nextInt();

        int sum = 0;
        int temp = N;

        while (temp > 0) {
            sum += temp % 10;   // Lấy chữ số cuối
            temp /= 10;         // Bỏ chữ số cuối
        }

        System.out.println("Tổng các chữ số của " + N + " là: " + sum);
    }
}