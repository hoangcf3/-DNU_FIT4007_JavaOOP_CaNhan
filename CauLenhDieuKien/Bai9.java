package CauLenhDieuKien;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("N phải là số nguyên dương!");
            return;
        }

        double can = Math.sqrt(N);

        if (can == (int) can) {
            System.out.println(N + " là số chính phương.");
        } else {
            System.out.println(N + " không phải là số chính phương.");
        }
    }
}

