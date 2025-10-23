package VongLap;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        do {
            System.out.print("Nhập số nguyên dương N (> 0): ");
            N = scanner.nextInt();

            if (N <= 0) {
                System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại!");
            }
        } while (N <= 0);

        System.out.println("Bạn đã nhập N = " + N);
    }
}