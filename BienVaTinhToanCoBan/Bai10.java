package BienVaTinhToanCoBan;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập 1 ký tự thường (a - y): ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'y') {
            char nextChar = (char) (ch + 1);
            System.out.println("Ký tự liền sau '" + ch + "' là '" + nextChar + "'");
        } else if (ch == 'z') {
            System.out.println("Ký tự sau 'z' không tồn tại trong bảng chữ cái thường!");
        } else {
            System.out.println("Vui lòng nhập ký tự thường từ a đến y!");
        }

        sc.close();
    }
}
