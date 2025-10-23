package LenhSwitchCase;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên chỉ giới tính (0: Nam, 1: Nữ, 2: Khác): ");
        int gender = scanner.nextInt();

        String result;

        switch (gender) {
            case 0: result = "Nam"; break;
            case 1: result = "Nữ"; break;
            case 2: result = "Khác"; break;
            default: result = "Giá trị không hợp lệ"; break;
        }

        System.out.println("Giới tính: " + result);
    }
}
