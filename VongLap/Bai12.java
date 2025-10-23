package VongLap;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(N + " là số nguyên tố");
        } else {
            System.out.println(N + " không phải là số nguyên tố");
        }
    }
}
