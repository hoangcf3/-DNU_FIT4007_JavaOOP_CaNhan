package VongLap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();

        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
