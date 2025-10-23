package CauLenhDieuKien;

import java.util.Scanner;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 3 góc
        System.out.print("Nhập góc a: ");
        int a = sc.nextInt();
        System.out.print("Nhập góc b: ");
        int b = sc.nextInt();
        System.out.print("Nhập góc c: ");
        int c = sc.nextInt();

        // Kiểm tra điều kiện tạo thành 3 góc của tam giác
        if (a > 0 && b > 0 && c > 0 && (a + b + c == 180)) {
            System.out.println("Ba góc a, b, c có thể là 3 góc của một tam giác.");
        } else {
            System.out.println("Ba góc a, b, c KHÔNG thể là 3 góc của một tam giác.");
        }
    }
}
