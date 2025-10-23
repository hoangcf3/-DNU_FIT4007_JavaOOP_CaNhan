package VongLap;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();

        boolean isPowerOfTwo = false;
        int value = 1;

        while (value <= N) {
            if (value == N) {
                isPowerOfTwo = true;
                break;
            }
            value *= 2;
        }

        if (isPowerOfTwo) {
            System.out.println(N + " là lũy thừa của 2.");
        } else {
            System.out.println(N + " không phải là lũy thừa của 2.");
        }
    }
}
