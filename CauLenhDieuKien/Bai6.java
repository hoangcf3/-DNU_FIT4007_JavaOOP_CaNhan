package CauLenhDieuKien;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = sc.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = sc.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 &&
                a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba cạnh a, b, c có thể tạo thành một tam giác.");
        } else {
            System.out.println("Ba cạnh a, b, c không tạo thành một tam giác.");
        }
    }
}

