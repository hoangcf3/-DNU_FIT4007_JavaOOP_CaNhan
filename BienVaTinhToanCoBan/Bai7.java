package BienVaTinhToanCoBan;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N (ít nhất 2 chữ số): ");
        int n = sc.nextInt();

        n = Math.abs(n);

        int ganCuoi = (n / 10) % 10;

        System.out.println("Chữ số gần cuối của số là: " + ganCuoi);

        sc.close();
    }
}
