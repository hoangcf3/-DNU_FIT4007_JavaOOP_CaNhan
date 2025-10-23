package BienVaTinhToanCoBan;

import java.util.Scanner;
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();

        System.out.print("Nhập b (khác 0): ");
        int b = sc.nextInt();

        if (b != 0) {
            System.out.println(a + " / " + b + " = " + ((double) a / b));
        } else {
            System.out.println("Lỗi: b không được bằng 0!");
        }

        sc.close();
    }
}
