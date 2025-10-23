package CauLenhDieuKien;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một số thực: ");
        float a = sc.nextFloat();

        int phanNguyen = (int) a;

        if (a == phanNguyen) {
            System.out.println(a + " là số nguyên.");
        } else {
            System.out.println(a + " không phải là số nguyên.");
        }
    }
}

